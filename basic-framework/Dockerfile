FROM maven:3.6.3-jdk-11-slim as builder

RUN mkdir /app

COPY /src /app/src

COPY /pom.xml /app/pom.xml

WORKDIR /app

RUN mvn clean

#FROM adoptopenjdk/openjdk11:alpine-jre

#COPY --from=builder 