FROM openjdk:11-jre
COPY target/bcp-service-directory-*SNAPSHOT.jar /opt/bcp-service-discovery.jar
ENTRYPOINT ["java","-jar","/opt/bcp-service-discovery.jar"]