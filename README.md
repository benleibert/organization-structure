# organization-structure
Sample application demonstrating use of JaVers Spring Boot starters.

## spring-boot-starter-data-mongodb

To build the app on my machine, create a PostgreSQL database called "javers" and then run:

```
gradle2 clean build -Dorg.gradle.java.home=/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home
```
NOTE: If the "javers" database already exists, it hsould be dropped and recreated. This is so as to delete any
previous state in the jv_* tables.


To start app using PostgreSQL, execute:
```
gradle2 organization-structure-sql:bootRun -Dorg.gradle.java.home=/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home
```

To start app using MongoDB, execute:
 
```
gradle2 organization-structure-mongo:bootRun -Dorg.gradle.java.home=/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home
```

If using MongoDB (3.0.0+), its expected to run on port 27017.

## REST API

Application exposes REST interface:

```
http://localhost:8080/view/hierarchy
http://localhost:8080/view/hierarchy/Hier_2015
http://localhost:8080/view/person
http://localhost:8080/view/person/0
```
