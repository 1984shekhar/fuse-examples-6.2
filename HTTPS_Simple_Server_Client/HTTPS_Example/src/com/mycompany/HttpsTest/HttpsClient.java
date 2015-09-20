package com.mycompany.HttpsTest;

import java.io.*;
import java.net.*;

import javax.net.ssl.*;
public class HttpsClient {
   public static void main(String[] args) throws InterruptedException {
      PrintStream out = System.out;

      // Getting the default SSL socket factory
      SSLSocketFactory f = 
         (SSLSocketFactory) SSLSocketFactory.getDefault();
      out.println("The default SSL socket factory class: "
         +f.getClass());
      try {
      // Getting the default SSL socket factory
         SSLSocket c =
           (SSLSocket) f.createSocket("localhost", 8888);
         printSocketInfo(c);
         c.startHandshake();
         System.out.println("After Handshake...0");
         BufferedWriter w = new BufferedWriter(new OutputStreamWriter(
            c.getOutputStream()));
         System.out.println("After Handshake...1");
         BufferedReader r = new BufferedReader(new InputStreamReader(
            c.getInputStream()));
         System.out.println("After Handshake...2");
         w.write("GET / HTTP/1.0");
         System.out.println("After Handshake...3");
         w.newLine();
         w.newLine(); // end of HTTP request
         System.out.println("After Handshake...4");
         w.flush();
         System.out.println("After Handshake...5");
         String m = null;
         Thread.sleep(1000);
         while ((m=r.readLine())!= null) {
        	 System.out.println(m);
         }
         System.out.println("After Handshake...6");
         w.close();
         System.out.println("After Handshake...7");
         r.close();
         System.out.println("After Handshake...8");
         c.close();
         System.out.println("After Handshake...9");
      } catch (IOException e) {
         System.err.println(e.toString());
      }
   }
   private static void printSocketInfo(SSLSocket s) {
      System.out.println("Socket class: "+s.getClass());
      System.out.println("   Remote address = "
         +s.getInetAddress().toString());
      System.out.println("   Remote port = "+s.getPort());
      System.out.println("   Local socket address = "
         +s.getLocalSocketAddress().toString());
      System.out.println("   Local address = "
         +s.getLocalAddress().toString());
      System.out.println("   Local port = "+s.getLocalPort());
      System.out.println("   Need client authentication = "
         +s.getNeedClientAuth());
      SSLSession ss = s.getSession();
      System.out.println("   Cipher suite = "+ss.getCipherSuite());
      System.out.println("   Protocol = "+ss.getProtocol());
   }
}