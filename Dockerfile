FROM maven:3.9.11-eclipse-temurin-21 AS build

WORKDIR /app

COPY portfolio/pom.xml .
COPY portfolio/src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

CMD ["sh", "-c", "java -jar app.jar --server.address=0.0.0.0 --server.port=${PORT:-8080}"]