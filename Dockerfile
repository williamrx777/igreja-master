FROM ubuntu:latest AS build
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .
RUN .mvn bootlar --no-daemon

FROM openjdk:17-jdk-slim
EXPOSE 8080
COPY --from-buid /buid/libs/rompendofe.jar rompendofe.jar

ENTRYPOINT ["java", "jar", "rompendofe.jar"]
