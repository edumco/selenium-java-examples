FROM edumco/maven:openjdk11-alpine

RUN apk add --no-cache chromium

WORKDIR /app

COPY pom.xml pom.xml

RUN mvn install --batch-mode --no-snapshot-updates dependency:resolve-plugins \
    dependency:resolve \
    dependency:go-offline

COPY . .

RUN mvn compile assembly:single --no-snapshot-updates



FROM adoptopenjdk/openjdk11:alpine-jre

WORKDIR /app

COPY --from=0 /app/target/*jar-with-dependencies.jar /app/app.jar

USER appuser

CMD [ "java", "-jar", "app.jar" ]