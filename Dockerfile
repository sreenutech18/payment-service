# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Make port  available to the world outside this container
EXPOSE 9092

COPY target/payment-service-1.0-SNAPSHOT.jar payment-service-1.0-SNAPSHOT.jar

# Run the jar file
ENTRYPOINT ["java","-jar","payment-service-1.0-SNAPSHOT.jar"]