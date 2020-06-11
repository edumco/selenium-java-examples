FROM edumco/maven:openjdk11-alpine-slim

RUN mkdir /app

WORKDIR /app

# Copies only pom to avoid build invalidation
COPY pom.xml pom.xml    

# Download dependencies to the maven cache to speep build
RUN mvn install --batch-mode --no-snapshot-updates dependency:resolve-plugins \
    dependency:resolve \
    dependency:go-offline

# Copies the code
COPY . .

# If this command still download files add this to pom.xml
#maven-surefire-plugin:2.12.4
#surefire-junit4/2.12.4
#surefire-providers/2.12.4
#
RUN mvn compile assembly:single --no-snapshot-updates

# Creates the final image
#
FROM adoptopenjdk/openjdk11:alpine-jre

RUN mkdir /app

COPY --from=0 /app/target/*.jar /app/app.jar

WORKDIR /app

CMD ["java" "-jar" "app.jar"] 
