package personal_tests.wildfire;

import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.ReconnectionManager;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.chat2.ChatManager;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;

import org.jxmpp.jid.impl.JidCreate;

import java.io.IOException;

public class SmackRetest {
    public static void main(String[] args) throws SmackException, IOException, XMPPException, InterruptedException {
        XMPPTCPConnectionConfiguration config = XMPPTCPConnectionConfiguration.builder()
                .setUsernameAndPassword("admin", "12345")
                .setXmppDomain("openxmpp")
                .build();
        XMPPTCPConnection messageConnection = new XMPPTCPConnection(config);
        messageConnection.connect().login();
        ReconnectionManager.getInstanceFor(messageConnection).enableAutomaticReconnection();
        ChatManager cManager = ChatManager.getInstanceFor(messageConnection);
        cManager.addIncomingListener((from, message, chat) -> {
            System.out.println(from + "sent you: " + message.getBody());
        });
        messageConnection.sendStanza(new Presence(Presence.Type.available));

        messageConnection.addAsyncStanzaListener(l -> { //receive friend request
            System.out.println(l.getFrom() + "wants to subscripe to you");
        }, f -> f instanceof Presence && ((Presence) f).getType().equals(Presence.Type.subscribe));

        messageConnection.addAsyncStanzaListener(l -> { //receive confirmation of a friend request
            System.out.println(l.getFrom() + " accepted your friend request");
        }, f -> f instanceof Presence && ((Presence) f).getType().equals(Presence.Type.subscribed));

        messageConnection.addAsyncStanzaListener(l -> { //receive denial of a friend request
            System.out.println(l.getFrom() + " denied your friend request");
        }, f -> f instanceof Presence && ((Presence) f).getType().equals(Presence.Type.unsubscribed));

        messageConnection.addAsyncStanzaListener(l -> { //receive unfriend request
            Presence unsubFrom = new Presence(l.getFrom().asBareJid(), Presence.Type.unsubscribed);
            messageConnection.sendStanza(unsubFrom);
        }, f -> f instanceof Presence && ((Presence) f).getType().equals(Presence.Type.unsubscribe));

        System.out.println("DONE");
    }
}
