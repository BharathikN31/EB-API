FROM ubuntu:latest
LABEL authors="Kishore  M A"
FROM maven:3.8.3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/API-EB-0.0.1-SNAPSHOT.jar API-EB.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","API-EB.jar"]