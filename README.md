# Spring-Boot-REST-API-for-Department-Management
This repository contains a comprehensive REST API for managing departments, built using Spring Boot. The API demonstrates a clean architecture with layered separation, includes key Spring Boot features, and supports various CRUD operations like creating, reading, updating, and deleting departments. The project also integrates advanced features like Hibernate Validation, logging with SLF4J, exception handling, and JUnit/Mockito-based unit testing.

**Features:**

- **REST Endpoints for managing departments:** Create, Retrieve, Update, and Delete operations.
- **Layered Architecture:**
  - **Controller Layer:** Handles HTTP requests.
  - **Service Layer:** Contains business logic.
  - **Repository Layer:** Manages database interactions.
- **Hibernate Validation for input validation.**
- **H2 Database for in-memory testing; MySQL for production.**
- **Custom Endpoints with flexible request handling.**
- **Profiles for environment-specific configurations.**
- **DevTools for live reload during development.**
- **Logging with SLF4J.**
- **Exception Handling for robust error reporting.**
- **Unit Testing for each layer using JUnit and Mockito.**
- **Executable JAR:** Packaged as `Spring-boot-rest-1.0.0.jar`.

