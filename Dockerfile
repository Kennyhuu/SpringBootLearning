FROM openjdk:17-oracle
# Set an argument for the JAR file (default to any .jar in target/)
ARG JAR_FILE=target/*.jar
#ARG JAR_FILE=*.jar
COPY ${JAR_FILE} application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "application.jar"]