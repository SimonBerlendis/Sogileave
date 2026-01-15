# Sogileave Ktor Application Dockerfile
# Optimized for Render deployment

# Use official Eclipse Temurin JDK 25 image
FROM eclipse-temurin:25-jdk-jammy as builder

# Set working directory
WORKDIR /app

# Copy build files and dependencies
COPY . .

# Build the application
RUN ./gradlew build --no-daemon

# Use a smaller JRE image for runtime
FROM eclipse-temurin:25-jre-jammy

# Create application user for security
RUN useradd -m -d /home/appuser appuser
WORKDIR /home/appuser

# Copy the built JAR from builder stage
COPY --from=builder /app/build/libs/*.jar /home/appuser/app.jar

# Set environment variables
ENV PORT=8080
ENV KTOR_ENV=production
ENV JAVA_OPTS="-XX:+UseContainerSupport -XX:MaxRAMPercentage=75.0"

# Expose the application port
EXPOSE $PORT

# Set permissions and run as non-root user
USER appuser

# Health check configuration
HEALTHCHECK --interval=30s --timeout=3s --start-period=30s --retries=3 \
  CMD curl -f http://localhost:$PORT/health || exit 1

# Start the application
CMD ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]