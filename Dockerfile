FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/springBootApp.jar springBootApp.jar
EXPOSE 8080
CMD ["java", "-jar","springBootApp.jar"]
