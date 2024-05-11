#Start with a base image
FROM openjdk:17-jdk-slim as built

MAINTAINER siferga.com

#Add app's jar to container
COPY target/ms-Loans-0.0.1-SNAPSHOT.jar ms-Loans-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/ms-Loans-0.0.1-SNAPSHOT.jar"]

