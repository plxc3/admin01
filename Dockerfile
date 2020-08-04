FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY  /root/.jenkins/workspace/CSDN/target//cdns.jar cdns.jar
ENTRYPOINT ["java","-jar","/cdns.jar","&"]