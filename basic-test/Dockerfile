FROM maven:3.6.3-jdk-8-slim

RUN mkdir /app

COPY . /app

WORKDIR /app

RUN mvn clean compile
