FROM openjdk:11-jdk

ARG ENV
ARG SUITE
RUN echo "Environment: ${ENV}"
RUN apt-get update
RUN apt-get install -y maven
COPY pom.xml /usr/local/test/pom.xml
COPY src /usr/local/test/src
WORKDIR /usr/local/test
RUN mvn clean test -Denv=$ENV -P$SUITE