FROM maven:3.8.5-openjdk-17 AS buid
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=buid /target/rompendofe-0.0.1-SNAPSHOT.jar rompendofe.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "rompendofe.jar"]