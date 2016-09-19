package com.karaf.connect;

import java.io.IOException;
import java.security.Security;

import org.apache.sshd.ClientChannel;
import org.apache.sshd.ClientSession;
import org.apache.sshd.SshClient;
import org.apache.sshd.client.channel.ChannelExec;
import org.apache.sshd.client.future.ConnectFuture;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class KarafExecConnection {

    public static void main(String[] args) throws Exception {
        String host = "localhost";
        int port = 8101;
        String user = "admin";
        String password = "admin";

        SshClient client = null;
        String[] command = {"stop --force 268"};
        ChannelExec channel = null;
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
            channel = session.createExecChannel(command[0]);
            channel.setOut(System.out);
            channel.setErr(System.err);
            channel.open().verify();
            channel.waitFor(ClientChannel.CLOSED, 0);
            if (channel.getExitStatus() != null) {
                int s = channel.getExitStatus();
                if (s != 0) {
                    throw new Exception("Command failed with status " + s);
                }
                System.out.println("Status: "+s);
            }
             } catch (InterruptedException e) {
             e.printStackTrace();
             throw e;
             } catch (IOException e) {
             e.printStackTrace();
             throw e;
             } catch (Exception e) {
             e.printStackTrace();
             throw e;
             } finally {
             client.stop();
             }
             


    }

}