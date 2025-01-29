FROM maven:3.9-amazoncorretto-17-alpine AS build

WORKDIR /app

# Clona la repository
RUN apk update && apk add --no-cache git
RUN git clone https://github.com/BerishaIslam/progetto-automated.git progetto && cd progetto && mvn clean install -DskipTests

# Seconda fase: esegue l'applicazione
FROM openjdk:17-jdk-slim

WORKDIR /app

ENV TZ=Europe/Rome

COPY --from=build /app/progetto/target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]