package personal_tests.wildfire.clients;

import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.ReconnectionManager;
import org.jivesoftware.smack.chat2.ChatManager;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.PresenceBuilder;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jxmpp.jid.impl.JidCreate;
import org.jxmpp.stringprep.XmppStringprepException;

public class C1 {
    private static AbstractXMPPConnection connection1, connection2;
    private static ChatManager cm1, cm2;
    public static void main(String[] args) throws Exception {
        init();
        connection1.addAsyncStanzaListener(sl -> System.out.format("Stanza on c1.  Stanza: %s | XML: %s\n", sl, sl.toXML()), sF -> true);
        connection2.addAsyncStanzaListener(sl -> System.out.format("Stanza on c2.  Stanza: %s | XML: %s\n", sl, sl.toXML()), sF -> true);

        Presence frq1 = PresenceBuilder.buildPresence().ofType(Presence.Type.subscribe).to(JidCreate.bareFrom("test_user_69@crushconnect.us")).build();
        Presence frq2 = PresenceBuilder.buildPresence().ofType(Presence.Type.subscribe).to(JidCreate.bareFrom("tester@crushconnect.us")).build();

        connection1.sendStanza(frq1);
        connection2.sendStanza(frq2);

        while(true){}
    }

    private static void init() throws Exception{
        XMPPTCPConnectionConfiguration config1 = XMPPTCPConnectionConfiguration.builder()
                .setUsernameAndPassword("tester", "12345")
                .setXmppDomain("crushconnect.us")
                .setHost("chat.crushconnect.us")
                .build();
        XMPPTCPConnectionConfiguration config2 = XMPPTCPConnectionConfiguration.builder()
                .setUsernameAndPassword("test_user_69", "1234")
                .setXmppDomain("crushconnect.us")
                .setHost("chat.crushconnect.us")
                .build();

        connection1 = new XMPPTCPConnection(config1);
        connection2 = new XMPPTCPConnection(config2);

        connection1.connect().login();
        connection2.connect().login();

        cm1 = ChatManager.getInstanceFor(connection1);
        cm2 = ChatManager.getInstanceFor(connection2);

        ReconnectionManager.getInstanceFor(connection1).enableAutomaticReconnection();
        ReconnectionManager.getInstanceFor(connection2).enableAutomaticReconnection();

        Presence availible = PresenceBuilder.buildPresence().ofType(Presence.Type.available).build();

        connection1.sendStanza(availible);
        connection2.sendStanza(availible);
    }
}
