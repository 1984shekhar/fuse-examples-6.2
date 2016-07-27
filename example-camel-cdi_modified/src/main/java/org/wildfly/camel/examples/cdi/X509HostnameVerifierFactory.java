package org.wildfly.camel.examples.cdi;

import javax.inject.Named;
import javax.enterprise.inject.Produces;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;

public class X509HostnameVerifierFactory {
    @Produces @Named("x509HostnameVerifier")
    public X509HostnameVerifier create() {
        return new AllowAllHostnameVerifier();
    }
}
