package personal_tests.wildfire;

import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.chat2.Chat;
import org.jivesoftware.smack.chat2.ChatManager;
import org.jivesoftware.smack.chat2.IncomingChatMessageListener;
import org.jivesoftware.smack.chat2.OutgoingChatMessageListener;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.MessageBuilder;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jxmpp.jid.EntityBareJid;
import org.jxmpp.jid.impl.JidCreate;

import java.io.IOException;
import java.util.Scanner;

public class SmackTest {
    public static void main(String[] args) throws SmackException, IOException, XMPPException, InterruptedException {
        XMPPTCPConnectionConfiguration config = XMPPTCPConnectionConfiguration.builder()
                .setUsernameAndPassword("tester2", "1234")
                .setXmppDomain("openxmpp")
                .setHost("openxmpp")
                .build();
        AbstractXMPPConnection connection = new XMPPTCPConnection(config);
        connection.connect();
        connection.login();
        connection.sendStanza(new Presence(Presence.Type.available));
        ChatManager manager = ChatManager.getInstanceFor(connection);
        Chat chat = manager.chatWith(JidCreate.entityBareFrom("tester1@openxmpp"));
        manager.addIncomingListener((entityBareJid, message, chat2) -> System.out.format("\nRecieving| JID: %s - MESSGAE: %s", entityBareJid.toString(), message.getBody()));
        manager.addOutgoingListener((entityBareJid, messageBuilder, chat1) -> System.out.format("\nSENDING| JID: %s - MESSAGE: %s", entityBareJid.toString(), messageBuilder.getBody()));
        Scanner scanline = new Scanner(System.in);
        System.out.println("Messaging 'tester1' on spark\n>>>  ");
        while(true){
            String line = scanline.nextLine();
            if(line.equals("exit")) {
                connection.sendStanza(new Presence(Presence.Type.unavailable));
                System.exit(0);
            } else {
                chat.send(line);
            }
        }
    }
}