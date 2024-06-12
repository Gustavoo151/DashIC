# Etapa de build
FROM ubuntu:latest AS build

RUN apt-get update && apt-get install -y openjdk-21-jdk maven

# Copia o código-fonte para a imagem de build
COPY . /app
WORKDIR /app

# Executa o Maven install com logs detalhados
RUN mvn clean install -e -X || (cp -r /app/target/surefire-reports /app/surefire-reports && false)

# Etapa final
FROM openjdk:21-slim

EXPOSE 8080

# Copia o JAR construído da etapa de build
COPY --from=build /app/target/dashbpm-0.0.1-SNAPSHOT.jar /app/app.jar
COPY --from=build /app/surefire-reports /app/surefire-reports

ENTRYPOINT ["java", "-jar", "/app/app.jar"]