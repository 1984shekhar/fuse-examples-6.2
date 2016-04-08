osgi:install -s mvn:com.mycompany/cxf-rest-https-endpoint/1.0-SNAPSHOT

Generate Certificate:
Generate Certificate:
keytool -genkey -dname "CN=localhost, OU=Engineering, O=Progress, ST=Co. Dublin, C=IE" -validity 365 -alias CertAlias -keypass CertPassword -keystore CertName.jks -storepass CertPassword

best: keytool -genkey -validity 365 -alias websocketAlias -keypass changeit -keystore websocket.jks -storepass changeit -dname "CN=localhost, OU=Integration, O=FuseSource, ST=Namur, C=BE" -keyalg rsa

#keytool -exportcert -keystore CertName.jks -storepass CertPassword -alias CertAlias -file CertName.cer
#keytool -import -file /home/cpandey/NotBackedUp/Development/JBoss-Distributions-Fuse/jboss-fuse-6.2.1.redhat-084/etc/CertName.cer -keystore cacerts -storepass changeit
