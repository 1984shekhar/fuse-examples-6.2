1. unzip it to your local file system;
2. go to project "jaxws-server-https-spring" and rebuild it with command "mvn clean install";
3. start dummy server by command "mvn -Pserver";
4. go to project "camel-cxf-https-spring-client" and rebuild it with command "mvn clean install";
5. deploy the client to JBoss Fuse 6.2.1 container:
install -s mvn:org.jboss.fuse.samples/camel-cxf-https-spring-client/1.0
