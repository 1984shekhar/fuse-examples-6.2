Camel Router Project for Blueprint (OSGi)
=========================================

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:
	features:install spring-jdbc
	osgi:install -s wrap:file:/home/cpandey/NotBackedUp/Downloads/postgresql-9.0-801.jdbc4.jar
    osgi:install -s mvn:com.mycompany/PostGreSqlTest/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/

    
    Table schema:
    
    CREATE TABLE public.testtable (
	id int4 NOT NULL,
	age int4 NOT NULL,
	address bpchar(50),
	CONSTRAINT testtable_pkey PRIMARY KEY (id)
);