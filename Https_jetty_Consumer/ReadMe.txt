Camel Router Project for Blueprint (OSGi)
=========================================


    
    Installation Steps:
    
    1) Create a keystore(for testing purpose, it should be replaced later with third party keystore)
    keytool -genkey -keyalg RSA -alias testKeystore -keystore test.jks -validity 360
    
    
    2) Now change the  path of keystore <entry key="keystore" value="/home/cpandey/test.jks"/> to location where keystore is created.
    
    3) Build project using 'mvn clean install'.
    
    4) osgi:install -s mvn:com.mycompany/jetty-https-consumer/1.0.0-SNAPSHOT
    
    5) Access using url: https://127.0.0.1:9090/myapp/myservice

