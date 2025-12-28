
# Use Eclipse Temurin OpenJDK 17
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy source code
COPY src/ src/

# Compile Java source code
RUN javac src/simplecalculator/SimpleCalculator.java

# Run the application
CMD ["java", "-cp", "src", "simplecalculator.SimpleCalculator"]
