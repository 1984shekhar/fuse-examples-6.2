osgi:install -s mvn:com.mycompany/cxf-soap-https-endpoint/1.0-SNAPSHOT

Generate Certificate:
keytool -genkey -dname "CN=Alice, OU=Engineering, O=Progress, ST=Co. Dublin, C=IE" -validity 365 -alias CertAlias -keypass CertPassword -keystore CertName.jks -storepass CertPassword
