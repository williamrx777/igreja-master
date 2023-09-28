FROM openjdk:17
COPY . /usr/src/rompendo.fe
WORKDIR /usr/src/rompendo.fe
RUN javac Main.java
CMD ["java", "Main"]