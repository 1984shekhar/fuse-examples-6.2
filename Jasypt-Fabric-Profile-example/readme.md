## Configuration sample
```


fabric:profile-create TestProfile

fabric:profile-edit --bundles mvn:com.mycompany/fabric-route-info/1.0 TestProfile

fabric:profile-edit --features fabric-camel TestProfile

fabric:profile-edit --features camel-jasypt TestProfile
fabric:profile-edit --features camel-blueprint TestProfile
fabric:profile-edit --features camel-core TestProfile
fabric:profile-edit --pid test.profile/rest.password=ENC(Bpd9dCuFmp7lzxqibjXOQg==) TestProfile

fabric:container-add-profile root TestProfile


camel:route-info

```

How to encrypt and decrypt string:

At location jboss-fuse-6.2.1.redhat-084/extras extract apache-camel-2.15.1.redhat-621084.zip and go to location jboss-fuse-6.2.1.redhat-084/extras/apache-camel-2.15.1.redhat-621084/lib. Here execute below command:

[cpandey@cpandey lib]$ java -jar camel-jasypt-2.15.1.redhat-621084.jar -c encrypt -p secret -i tiger
Encrypted text: Bpd9dCuFmp7lzxqibjXOQg==
[cpandey@cpandey lib]$ 
[cpandey@cpandey lib]$ java -jar camel-jasypt-2.15.1.redhat-621084.jar -c decrypt -p secret -i Bpd9dCuFmp7lzxqibjXOQg==


