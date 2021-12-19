FROM ghcr.io/edumco/maven-alpine:jdk17 as builder

RUN apk add --no-cache chromium

WORKDIR /app

COPY pom.xml pom.xml

RUN mvn install --batch-mode --no-snapshot-updates dependency:resolve-plugins \
    dependency:resolve \
    dependency:go-offline

COPY . .

RUN mvn --no-snapshot-updates compile assembly:single 

FROM adoptopenjdk/openjdk16:alpine-jre as runner

WORKDIR /app

COPY --from=builder /app/target/*jar-with-dependencies.jar /app/app.jar

USER appuser

CMD [ "java", "-jar", "app.jar" ]
