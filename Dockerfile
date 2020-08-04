FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/demojenkins.jar cdns.jar
ENTRYPOINT ["java","-jar","/cdns.jar","&"]