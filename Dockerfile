
 FROM openjdk:17-jdk-slim


WORKDIR /app

COPY src ./src

EXPOSE 8080

RUN javac src/simplecalculator/WebApp.java

CMD ["java", "-cp", "src", "simplecalculator.WebApp"]
