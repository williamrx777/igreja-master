FROM eclipse-temurin:17-jdk-alpine
VOLUME /src
COPY target/*.jar rompendofe.jar
ENTRYPOINT ["java","-jar","/rompendofe.jar"]
