Procedure to install:



JBossFuse:karaf@root> install -s mvn:xom/xom/1.2.5
Bundle ID: 294
JBossFuse:karaf@root> features:install camel-xmljson 
#Deploy my custom bundle
JBossFuse:karaf@root> osgi:install -s mvn:com.mycompany/camel-blueprint-cbr/1.0.0-SNAPSHOT


