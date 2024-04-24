# Stage 1: Build the application
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

COPY target/kranthi-0.0.1-backend.jar /app/app.jar

EXPOSE 8080
CMD ["java", "-jar", "app.jar"]