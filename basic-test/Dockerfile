###############################################################################
#                           Build dependencies                                #
###############################################################################

FROM edumco/maven:openjdk11-alpine-slim

RUN mkdir /app

WORKDIR /app

# Copies only pom to avoid build invalidation
COPY pom.xml pom.xml    

# Download dependencies to the maven cache to speep build
RUN mvn install --batch-mode --no-snapshot-updates dependency:resolve-plugins \
    dependency:resolve \
    dependency:go-offline

###############################################################################
#                           Test Aplication                                   #
###############################################################################

FROM edumco/maven:firefox-esr

# Copies the code
COPY . .

# If this command still download files add this to pom.xml
#maven-surefire-plugin:2.12.4
#surefire-junit4/2.12.4
#surefire-providers/2.12.4
#
RUN mvn compile assembly:single --no-snapshot-updates

RUN mvn test

###############################################################################
#                           Run application                                   #
###############################################################################

FROM adoptopenjdk/openjdk11:alpine-jre

RUN mkdir /app

WORKDIR /app

COPY --from=1 /app/target/*jar-with-dependencies.jar /app/app.jar

CMD [ "java", "-jar", "app.jar" ]