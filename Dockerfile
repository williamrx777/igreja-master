FROM maven:4.0.0-openjdk-17 AS build
COPY src .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.8-jdk-slim
COPY --from=build /target/rompendo.fe-0.0.1-SNAPSHOT.jar rompendo.fe.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","rompendo.fe.jar"]