Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.cdg.cn3.job/job_dao/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/


fabric:profile-create --parent default jdg-cacheservice
profile-edit --repositories mvn:org.infinispan/infinispan-embedded/6.4.0.Final-redhat-4/xml/features jdg-cacheservice
profile-edit --repositories  mvn:com.mycompany.testBundle/features/1.0.0/xml/features jdg-cacheservice
profile-edit --feature jdg-job-service jdg-cacheservice
fabric:container-create-child --profile jdg-cacheservice fuse1 fuse1_cacheservice
