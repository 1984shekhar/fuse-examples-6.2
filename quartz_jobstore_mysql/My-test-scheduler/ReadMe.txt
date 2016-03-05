features:install jndi
features:install camel-quartz2
osgi:install -s mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.commons-dbcp/1.4_3
osgi:install -s wrap:file:/home/cpandey/NotBackedUp/Development/OracleDriver/ojdbc5-11.2.0.2.0.jar
osgi:install -s mvn:com.mycompany/oracle-datasource/1.0.0-SNAPSHOT
features:install camel-quartz2
osgi:install -s file:/NotBackedUp/cpandey/Downloads/My-test-cheduler/target/my-quartz-scheduler-1.25.HA.jar
<groupId>com.abc.test</groupId>
    <artifactId>my-quartz-scheduler</artifactId>
    <version>1.25.HA</version>
    <packaging>bundle</packaging>
    
    mvn:com.abc.test/my-quartz-scheduler/1.25.HA
    
    
    
profile-create --parent feature-camel quartzClusteredScheduler
profile-edit --feature camel-blueprint --feature camel-quartz2 --feature jndi --feature spring-jdbc quartzClusteredScheduler 
profile-edit --bundle  mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.commons-dbcp/1.4_3 --bundle mvn:commons-pool/commons-pool/1.6 quartzClusteredScheduler 
#Oracle
profile-edit --bundle wrap:file:/home/cpandey/NotBackedUp/Development/OracleDriver/ojdbc5-11.2.0.2.0.jar quartzClusteredScheduler 
#Mysql
profile-edit --bundle wrap:file:/home/cpandey/NotBackedUp/Development/mysql-connector-java-5.1.34/mysql-connector-java-5.1.34-bin.jar quartzClusteredSchedulerprofile-edit --bundle mvn:com.mycompany/oracle-datasource/1.0.0-SNAPSHOT quartzDB_interaction 
profile-edit --bundle mvn:com.mycompany/oracle-datasource/1.0.0-SNAPSHOT quartzClusteredScheduler 

 
#profile-create --parent quartzClusteredScheduler quartzDB_interaction

#profile-edit --bundle mvn:com.abc.test/my-quartz-scheduler/1.25.HA quartzDB_interaction

profile-create --parent quartzClusteredScheduler quartzDB_interaction
profile-edit --repository file:/NotBackedUp/cpandey/Downloads/My-test-cheduler/features1.xml quartzDB_interaction 
profile-edit --feature featurequartz quartzDB_interaction 
 
 
    
    