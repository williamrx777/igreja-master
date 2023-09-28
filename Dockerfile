FROM openjdk:17
COPY . /usr/src/rompendo.fe
WORKDIR /usr/src/rompendo.fe
RUN javac Application.java
CMD ["java", "Application"]