https://www.baeldung.com/spring-boot-postgresql-docker

mvn clean package -DskipTests

Uses the system-installed Maven (mvn command must be available in your system's PATH).

Requires that Maven is already installed on your machine.

./mvnw clean package -DskipTests

Uses the Maven Wrapper (mvnw), which is a script that ensures a specific Maven version is used.

The wrapper will automatically download and use the Maven version defined in the project's mvn/wrapper/maven-wrapper.properties file.

Useful for projects where you want to ensure everyone uses the same Maven version without requiring a manual installation.