FROM openjdk:8-jre
VOLUME /tmp
WORKDIR /data
COPY target/init-service.jar  /data
ENTRYPOINT ["java" ,"-jar", "init-service.jar"]