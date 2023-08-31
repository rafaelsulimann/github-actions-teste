FROM maven:3.8.4-openjdk-17-slim AS builder
WORKDIR /app
COPY . .
RUN mvn clean package

FROM openjdk:17-slim
WORKDIR /app
COPY --from=builder /app/target/authuser-0.0.1-SNAPSHOT.jar ./authuser.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/app/authuser.jar"]