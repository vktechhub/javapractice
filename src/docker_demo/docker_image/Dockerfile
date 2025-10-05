# Use a base image with Java installed (e.g., OpenJDK 17)
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY docker_demo-0.0.1-SNAPSHOT.jar /app/docker_demo-0.0.1-SNAPSHOT.jar

# Expose any ports your application listens on (e.g., 8080 for a web app)
EXPOSE 8080

# Define the command to run your JAR file when the container starts
ENTRYPOINT ["java", "-jar", "docker_demo-0.0.1-SNAPSHOT.jar"]