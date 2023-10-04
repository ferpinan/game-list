FROM maven:3.9.4-eclipse-temurin-17 as builder
WORKDIR /home/game-list/
COPY /src /home/game-list/src
COPY pom.xml /home/game-list/
RUN mvn clean package -DfinalName=game-list

FROM openjdk:17-jdk-slim
VOLUME /home/logs
COPY --from=builder /home/game-list/target/game-list.jar /home/game-list.jar
EXPOSE 8080
CMD ["java", "-jar", "/home/game-list.jar"]