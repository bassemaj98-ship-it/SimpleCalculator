
FROM eclipse-temurin:17
WORKDIR /app
COPY SimpleCalculator.java .
RUN javac SimpleCalculator.java
EXPOSE 8080
CMD ["java", "SimpleCalculator"]

