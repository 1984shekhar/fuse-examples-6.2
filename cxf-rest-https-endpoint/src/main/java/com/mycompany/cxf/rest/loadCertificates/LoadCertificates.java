package com.mycompany.cxf.rest.loadCertificates;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;

import org.apache.cxf.configuration.jsse.TLSServerParameters;
import org.apache.cxf.transport.http_jetty.JettyHTTPServerEngineFactory;

public class LoadCertificates {

	public static void configureSSLOnTheServer(int port) {
        try {
            TLSServerParameters tlsParams = new TLSServerParameters();
            KeyStore keyStore = KeyStore.getInstance("JKS");
            String password = "CertPassword";
            File keystore = new File("/NotBackedUp/cpandey/Development/JBoss-Distributions-Fuse/jboss-fuse-6.0.0.redhat-024/etc/CertName.jks");
            keyStore.load(new FileInputStream(keystore), password.toCharArray());
            KeyManagerFactory keyFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            keyFactory.init(keyStore, password.toCharArray());
            KeyManager[] km = keyFactory.getKeyManagers();
            tlsParams.setKeyManagers(km);

            JettyHTTPServerEngineFactory factory = new JettyHTTPServerEngineFactory();
            factory.setTLSServerParametersForPort(port, tlsParams);

        } catch (KeyStoreException kse) {
            System.out.println("KeyStoreException : Security configuration failed with the following: " + kse.getCause());
        } catch (NoSuchAlgorithmException nsa) {
            System.out.println("NoSuchAlgorithmException: Security configuration failed with the following: " + nsa.getCause());
        } catch (FileNotFoundException fnfe) {
            System.out.println("FileNotFoundException : Security configuration failed with the following: " + fnfe.getCause());
        } catch (UnrecoverableKeyException uke) {
            System.out.println("UnrecoverableKeyException : Security configuration failed with the following: " + uke.getCause());
        }  catch (GeneralSecurityException gse) {
            System.out.println("GeneralSecurityException : Security configuration failed with the following: " + gse.getCause());
        } catch (IOException ioe) {
            System.out.println("IOException: Security configuration failed with the following: " + ioe.getCause());
        }

    }
}
