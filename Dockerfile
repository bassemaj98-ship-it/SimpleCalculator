
 FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY src src

RUN javac src/WebApp.java

EXPOSE 8080

CMD ["java", "-cp", "src", "WebApp"]
