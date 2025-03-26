https://www.baeldung.com/spring-boot-postgresql-docker

# Maven 

./mvnw clean package -DskipTests

Uses the Maven Wrapper (mvnw), which is a script that ensures a specific Maven version is used.

The wrapper will automatically download and use the Maven version defined in the project's mvn/wrapper/maven-wrapper.properties file.

Useful for projects where you want to ensure everyone uses the same Maven version without requiring a manual installation.

# Swagger

http://localhost:8080/swagger-ui/index.html