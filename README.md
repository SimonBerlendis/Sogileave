# Sogileave
Planbot paid leave

[![CI/CD Pipeline](https://github.com/sberlendis/Sogileave/actions/workflows/ci-cd.yml/badge.svg)](https://github.com/sberlendis/Sogileave/actions/workflows/ci-cd.yml)

## CI/CD Status

- **Build Status**: ![Build Status](https://img.shields.io/github/actions/workflow/status/sberlendis/Sogileave/ci-cd.yml?branch=main&label=Build)
- **Test Coverage**: ![Test Coverage](https://img.shields.io/badge/coverage-80%25-yellow)
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
2. **Build Stage**: Creates deployable JAR artifacts
3. **Deploy Stage**: Publishes releases to GitHub Releases

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

## Development

The project follows trunk-based development with:
- Main branch always deployable
- Feature branches short-lived
- Pull requests for all changes

## License

This project is proprietary and all rights are reserved.
