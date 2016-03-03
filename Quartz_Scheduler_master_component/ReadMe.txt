Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.mycompany/camel-blueprint-quartzScheduler/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/

    
profile-create --parents feature-camel TestProfile
profile-edit --features camel-blueprint --features camel-quartz2 TestProfile 
profile-edit --bundles mvn:com.mycompany/camel-blueprint-quartzScheduler/1.0.0-SNAPSHOT TestProfile 
container-add-profile abc TestProfile 
container-add-profile xyz TestProfile