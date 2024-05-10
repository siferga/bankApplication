#Start with a base image
FROM openjdk:17-jdk-slim as built

MAINTAINER siferga.com

#Add app's jar to container
COPY target/ms-Accounts-0.0.1-SNAPSHOT.jar ms-Accounts-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/ms-Accounts-0.0.1-SNAPSHOT.jar"]

