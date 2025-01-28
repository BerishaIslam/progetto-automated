FROM openjdk:17-jdk-slim

# Imposta la directory di lavoro nel contenitore
WORKDIR /app

# Copia il file JAR generato nel contenitore
COPY target/automated-0.0.1-SNAPSHOT.jar app.jar

# Espone la porta 8080 (tipica per le app Spring Boot)
EXPOSE 8080

# Imposta il fuso orario di Roma
ENV TZ=Europe/Rome

# Comando di avvio dell'applicazione
ENTRYPOINT ["java", "-jar", "app.jar"]
