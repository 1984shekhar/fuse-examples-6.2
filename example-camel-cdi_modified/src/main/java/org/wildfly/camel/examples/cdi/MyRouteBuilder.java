/*
 * #%L
 * Wildfly Camel :: Testsuite
 * %%
 * Copyright (C) 2013 - 2014 RedHat
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wildfly.camel.examples.cdi;

import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.ContextName;
import org.apache.camel.component.http4.HttpComponent;
import org.apache.camel.component.http4.HttpMethods;
import org.apache.camel.util.jsse.KeyStoreParameters;
import org.apache.camel.util.jsse.SSLContextParameters;
import org.apache.camel.util.jsse.TrustManagersParameters;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;

@Startup
@ApplicationScoped
@ContextName("cdi-context")
public class MyRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	
    	System.out.println("Within configure method of routeBuilder class");
    	/*KeyStoreParameters ksp = new KeyStoreParameters();
        ksp.setResource("/home/cpandey/NotBackedUp/Development/apache-tomcat-7.0.62/tomcat_keystore.jks");
        ksp.setPassword("changeit");
        TrustManagersParameters tmp = new TrustManagersParameters();
        tmp.setKeyStore(ksp);

        SSLContextParameters scp = new SSLContextParameters();
        scp.setTrustManagers(tmp);
        HttpComponent httpComponent = getContext().getComponent("https4", HttpComponent.class);
        httpComponent.setSslContextParameters(scp);*/
        HttpComponent httpComponent = getContext().getComponent("https4", HttpComponent.class);
        //httpComponent.setX509HostnameVerifier(new AllowAllHostnameVerifier());
    	from("direct:start")
            .setHeader(Exchange.HTTP_METHOD, constant(HttpMethods.GET))
            .setHeader("Authorization", constant("BASIC Y3NwOmNzcA=="))
            .to("https4://localhost:9443/HttpsDownloadFile/DownloadFileServlet?x509HostnameVerifier=x509HostnameVerifier")
            //.to("https4://localhost:9443/HttpsDownloadFile/DownloadFileServlet")
            .log("....${body}....");
            //.to("file:///home/cpandey/NotBackedUp/Development/apache-tomcat-7.0.62");
    }
}
