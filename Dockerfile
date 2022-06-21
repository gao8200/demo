FROM openjdk:8-jdk-alpine
ADD target/demo-backend-1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]