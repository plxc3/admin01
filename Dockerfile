FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/cdns.jar cdns.jar
ENTRYPOINT ["java","-jar","/cdns.jar","&"]