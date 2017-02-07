Fabric Install
--------------

To install this enonxample into a fabric environment, ensure the build code is in a maven repository accessible by your fabric:

1) Create a new profile with karaf as the parent

	profile-create --parents karaf  hibernate-cxfnonxa

2) Add the feature repositories to the profile

	profile-edit --repositories mvn:com.mycompany.ecf/features/1.0-SNAPSHOT/xml/features hibernate-cxfnonxa  

3) Add the feature to the profile
	
	profile-edit --features hibernate-jpa-example hibernate-cxfnonxa 

4) Add the JDBC Driver Bundle to the profile

	profile-edit --bundles wrap:mvn:com.oracle/ojdbc6/11.2.0 hibernate-cxfnonxa 

5) Assign to profile to a container

	container-add-profile fuse-services1 hibernate-cxfnonxa

6) Verify deployment

	JBossFuse:admin@root> container-list 
	[id]                           [version] [connected] [profiles]                                         [provision status]
	fuse-services2                 77.02     true        default, hibernate-cxfnonxa                           success

	Fabric8:admin@fuse-services2> osgi:list
	[1942] [Active     ] [Created     ] [   60] hibernatetx :: CXF Hibernate (1.0.0.SNAPSHOT)
	[1943] [Active     ] [Created     ] [   60] hibernatetx :: Datamodel (1.0.0.SNAPSHOT)
	[1944] [Active     ] [Created     ] [   60] hibernatetx :: nonxa-Datasource (1.0.0.SNAPSHOT)

7) Done!



Fuse Install:
JBossFuse:karaf@root>features:addurl mvn:com.mycompany.ecf/features/1.0-SNAPSHOT/xml/features
JBossFuse:karaf@root>features:install hibernate-jpa-example 
JBossFuse:karaf@root> list -t 0|grep hibernatetx
[ 295] [Active     ] [Created     ] [       ] [   90] hibernatetx :: nonxa-Datasource (1.0.0.SNAPSHOT)
[ 296] [Active     ] [            ] [       ] [   95] hibernatetx :: Datamodel (1.0.0.SNAPSHOT)
JBossFuse:karaf@root> ls 296

hibernatetx :: Datamodel (296) provides:
----------------------------------------
objectClass = [javax.persistence.EntityManagerFactory]
org.apache.aries.jpa.container.managed = true
org.apache.aries.jpa.default.unit.name = false
osgi.unit.name = cxfhibernate
osgi.unit.provider = org.hibernate.ejb.HibernatePersistence
osgi.unit.version = 1.0.0.SNAPSHOT
service.id = 634
JBossFuse:karaf@root> 


