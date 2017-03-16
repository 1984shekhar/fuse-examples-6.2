Camel MyBatis Example
=====================

This example shows how to exchange data using a shared database table.

The example has two Camel routes. The first route insert new data into the table,
triggered by a timer to run every 5th second.

The second route pickup the newly inserted rows from the table,
process the row(s), and mark the row(s) as processed when done;
to avoid picking up the same rows again.

You will need to install this example first to your local maven repository with:
  mvn install

This example requires running in Apache Karaf / ServiceMix

Steps to install in Fuse:
features:install camel-mybatis 
osgi:install -s mvn:org.apache.derby/derby/10.11.1.1
osgi:install -s mvn:org.apache.camel/camel-example-mybatis/2.15.1.redhat-621084
