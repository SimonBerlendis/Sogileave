# Sogileave
Planbot paid leave

[![CI/CD Pipeline](https://github.com/sberlendis/Sogileave/actions/workflows/ci-cd.yml/badge.svg)](https://github.com/sberlendis/Sogileave/actions/workflows/ci-cd.yml)

## Status

- **Build Status**: ![Build Status](https://img.shields.io/github/actions/workflow/status/sberlendis/Sogileave/ci-cd.yml?branch=main&label=Build)
- **Java Version**: ![Java 25](https://img.shields.io/badge/Java-25-blue)
- **Kotlin Version**: ![Kotlin 2.3.0](https://img.shields.io/badge/Kotlin-2.3.0-purple)
- **Deployment**: ![Render](https://img.shields.io/badge/Deployment-Render-blue)
- **Docker**: ![Docker](https://img.shields.io/badge/Docker-Enabled-blue)

## About

Sogileave is a Planbot paid leave management system built with:
- **Kotlin 2.3.0**
- **Ktor 3.3.3**
- **Gradle 9.1.0**
- **Java 25**

## Getting Started

### Prerequisites
- Java 25
- Gradle 9.1.0

### Running the Application

```bash
./gradlew run
```

### Running Tests

```bash
./gradlew test
```

### Building

```bash
./gradlew build
```

## CI/CD Pipeline

This project uses GitHub Actions for continuous integration with automatic Docker deployment to Render:

### Pipeline Stages:

1. **Test Stage** (Runs on every push/PR to main):
   - Sets up Java 25 environment
   - Runs comprehensive test suite
   - Uploads test results as artifacts
   - Fails fast if tests don't pass

### 🐳 Docker Deployment on Render

- **Production URL**: [https://sogileave.onrender.com](https://sogileave.onrender.com)
- **Status**: ![Render Status](https://img.shields.io/website?url=https://sogileave.onrender.com)
- **Auto-Deploy**: Enabled on main branch pushes
- **Automatic Trigger**: Push to main branch
- **Render Integration**: Render detects changes and builds Docker image
- **Docker Deployment**: Container deploys with health check verification
- **Zero Downtime**: Render handles rolling deployments

## Configuration

### Environment Variables
- `PORT`: Set the server port (default: 8080)
- `KTOR_ENV`: Set to "production" for production mode
- `JAVA_OPTS`: JVM optimization options (set in Dockerfile)

## Project Structure

```
.
├── Dockerfile                  # Docker configuration
├── .github/workflows/ci-cd.yml  # CI/CD pipeline
└── src/                        # Application source code
```

## Development

The project follows trunk-based development with:
- Main branch always deployable
- Feature branches short-lived
- Pull requests for all changes

## License

This project is proprietary and all rights are reserved.
