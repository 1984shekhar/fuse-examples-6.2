osgi:install -s mvn:com.mycompany/cxf-soap-endpoint/1.1

Generate Certificate:
keytool -genkey -dname "CN=Alice, OU=Engineering, O=Progress, ST=Co. Dublin, C=IE" -validity 365 -alias CertAlias -keypass CertPassword -keystore CertName.jks -storepass CertPassword
