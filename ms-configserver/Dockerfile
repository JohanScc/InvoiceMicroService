FROM openjdk:13
EXPOSE 6005
ADD ./target/ms-configserver-0.0.1-SNAPSHOT.jar    app-configserver.jar
ENTRYPOINT ["java","-jar","/app-configserver.jar"]