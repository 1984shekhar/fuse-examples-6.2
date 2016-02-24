JBossFuse:karaf@root> profile-display testProfile 
Profile id: testProfile
Version   : 1.0
Attributes: 
	parents: feature-camel
Containers: xyz

Container settings
----------------------------
Features : 
	hibernate
	jndi
	jpa
	camel-blueprint

Bundles : 
	mvn:commons-pool/commons-pool/1.4
	mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.commons-dbcp/1.4_3
	wrap:file:/home/cpandey/NotBackedUp/Development/mysql-connector-java-5.1.34/mysql-connector-java-5.1.34-bin.jar


Configuration details
----------------------------

Other resources
----------------------------





profile-create --parents feature-camel testProfile
profile-edit --feature camel-blueprint testProfile
profile-edit --feature jndi --feature jpa --feature hibernate testProfile
profile-edit --bundles mvn:commons-pool/commons-pool/1.4 testProfile
profile-edit --bundles mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.commons-dbcp/1.4_3 testProfile 
profile-edit --bundles wrap:file:/home/cpandey/NotBackedUp/Development/mysql-connector-java-5.1.34/mysql-connector-java-5.1.34-bin.jar testProfile


profile-create --parents feature-cxf hibernateNamedQueryTest
profile-edit --bundles mvn:demo.datasource/mariadb-datasource/1.0 hibernateNamedQueryTest
profile-edit --bundles mvn:demo.jpa/employee-hibernate-jpa/1.0 hibernateNamedQueryTest