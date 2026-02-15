# Sogileave - Paid Leave Management System

## Project Description

Sogileave is a modern **Planbot paid leave management system** designed to streamline and automate employee leave processes. Built on cutting-edge technologies, Sogileave provides a foundation for comprehensive leave tracking, approval workflows, and reporting.

## Current Implementation

The project currently serves as a **production-ready foundation** with:

### Core Infrastructure
- **Ktor 3.3.3** web framework running on **Kotlin 2.3.0**
- **Java 25** runtime environment
- **Gradle 9.1.0** build system with centralized dependency management
- **Docker** containerization for consistent deployment

### Deployment & CI/CD
- **Automated GitHub Actions pipeline** for testing and deployment
- **Render.com hosting** with zero-downtime deployments
- **Production environment** available at [https://sogileave.onrender.com](https://sogileave.onrender.com)
- **Health monitoring** with endpoint checks and Docker health probes

### Current Features
- **RESTful API foundation** with Ktor routing
- **HTML templating** for web interfaces
- **Comprehensive testing** with JUnit 5
- **Structured logging** with Logback
- **Security-hardened** Docker configuration

## Technical Stack

| Component | Technology | Version |
|-----------|------------|---------|
| **Language** | Kotlin | 2.3.0 |
| **Framework** | Ktor | 3.3.3 |
| **Runtime** | Java | 25 |
| **Build Tool** | Gradle | 9.1.0 |
| **Container** | Docker | Latest |
| **Logging** | Logback | 1.5.14 |
| **Testing** | JUnit | 5.11.4 |

## Architecture

Sogileave follows a **clean, modular architecture**:

```
Application Layer → Plugin System → Route Handlers
     ↑                  ↑
  Configuration     Business Logic
     ↑                  ↑
  Dependencies     Data Access (future)
```

## Development Status

The project is currently in its **foundational phase** with:

✅ **Complete infrastructure** - Ready for feature development
✅ **Production deployment** - Live on Render.com
✅ **CI/CD pipeline** - Automated testing and deployment
✅ **Core web framework** - Ktor server with routing
✅ **Testing framework** - Comprehensive test coverage

🚧 **Upcoming development** - Leave management features, database integration, authentication

## Getting Started

```bash
# Run locally
./gradlew run

# Run tests
./gradlew test

# Build for production
./gradlew build
```

## Vision

Sogileave aims to become a **comprehensive leave management solution** with features including:
- Employee leave requests and approvals
- Leave balance tracking
- Manager dashboards
- Reporting and analytics
- Integration with HR systems

The current implementation provides a **solid, production-ready foundation** that can be rapidly extended with business-specific leave management functionality.