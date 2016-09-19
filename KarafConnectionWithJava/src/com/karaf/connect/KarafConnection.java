package com.karaf.connect;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.security.Security;

import org.apache.sshd.ClientChannel;
import org.apache.sshd.ClientSession;
import org.apache.sshd.SshClient;
import org.apache.sshd.client.future.ConnectFuture;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class KarafConnection {

    public static void main(String[] args) throws Exception {
        String host = "localhost";
        int port = 8101;
        String user = "admin";
        String password = "admin";

        SshClient client = null;
        String[] command = {"osgi:list"};
        try {
        	
        	Security.insertProviderAt(new BouncyCastleProvider(),1);
            client = SshClient.setUpDefaultClient();
            //setupAgent(user, client, null);
            client.start();
            ConnectFuture future = client.connect(user, host, port);
            future.await();
            ClientSession session = future.getSession();
            session.addPasswordIdentity(password);
            session.auth().verify();
            ClientChannel channel = session.createShellChannel();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            Writer w = new OutputStreamWriter(baos);
            for (String cmd : command) {
                w.append(cmd).append(" ");
            }
            w.append("\n");
            w.close();
            channel.setIn(new ByteArrayInputStream(baos.toByteArray()));
            channel.setOut(System.out);
            channel.setErr(System.err);
            channel.open();
            channel.waitFor(ClientChannel.CLOSED, 0);
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        } finally {
            try {
                client.stop();
            } catch (Throwable t) { }
        }
        System.exit(0);
    }
    




}