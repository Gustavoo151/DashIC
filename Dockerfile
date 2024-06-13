FROM maven:3.9.7-amazoncorretto-21 as build
WORKDIR /app
COPY . .
RUN  mvn clean package -X -DskipTests

FROM openjdk:21-ea-1-slim
WORKDIR /app
COPY --from=build ./app/target/*jar ./dashbpn.jar
ENTRYPOINT java -jar dashbpn.jar
