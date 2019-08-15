FROM openjdk:8-jdk-alpine
#VOLUME /tmp // useful if you want access to the host fs
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
