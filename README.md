# Sogileave
Planbot paid leave

[![CI/CD Pipeline](https://github.com/sberlendis/Sogileave/actions/workflows/ci-cd.yml/badge.svg)](https://github.com/sberlendis/Sogileave/actions/workflows/ci-cd.yml)

## CI/CD Status

- **Build Status**: ![Build Status](https://img.shields.io/github/actions/workflow/status/sberlendis/Sogileave/ci-cd.yml?branch=main&label=Build)
- **Java Version**: ![Java 25](https://img.shields.io/badge/Java-25-blue)
- **Kotlin Version**: ![Kotlin 2.3.0](https://img.shields.io/badge/Kotlin-2.3.0-purple)

## About

Sogileave is a Planbot paid leave management system built with:
- **Kotlin 2.3.0**
- **Ktor 3.3.3**
- **Gradle 9.1.0**
- **Java 25**

## CI/CD Pipeline

This project uses GitHub Actions for continuous integration and deployment:

1. **Test Stage**: Runs all tests with Java 25
2. **Build-and-Deploy Stage**: 
   - Builds the Ktor application
   - Creates deployment packages
   - Deploys website to GitHub Pages
   - Uploads all artifacts

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

### Deployment

The CI/CD pipeline provides multiple deployment options:

### 1. GitHub Pages Website 🌐
- Automatically deploys a frontend website to GitHub Pages
- Shows API status and documentation
- Accessible at: `https://<username>.github.io/Sogileave/`
- Includes responsive design and API monitoring

### 2. Application Deployment Package 📦
The CI/CD pipeline creates a complete deployment package that includes:
- Executable JAR file
- Startup scripts
- Deployment documentation

To deploy the backend application:
1. Download the `sogileave-deployment` artifact from GitHub Actions
2. Unzip the package
3. Run `./start.sh`

## Deployment Options

### Running with Custom Port
```bash
java -Dio.ktor.deployment.port=8080 -jar sogileave-*.jar
```

### Environment Variables
- `PORT`: Set the server port (default: 8080)
- `KTOR_ENV`: Set to "development" for development mode

## Development

The project follows trunk-based development with:
- Main branch always deployable
- Feature branches short-lived
- Pull requests for all changes

## License

This project is proprietary and all rights are reserved.
