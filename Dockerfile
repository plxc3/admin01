FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/admin.jar admin.jar
ENTRYPOINT ["java","-jar","/admin.jar", "&"]