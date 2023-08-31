FROM maven:3.8.4-openjdk-17-slim AS builder
WORKDIR /app
COPY . .
RUN mvn clean package

FROM openjdk:17-slim
WORKDIR /app
COPY --from=builder /app/target/actions-0.0.1-SNAPSHOT.jar ./actions.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/app/actions.jar"]