## Spring-Boot-REST-API-for-Department-Management
This repository contains a comprehensive REST API for managing departments, built using Spring Boot. The API demonstrates a clean architecture with layered separation, includes key Spring Boot features, and supports various CRUD operations like creating, reading, updating, and deleting departments. The project also integrates advanced features like Hibernate Validation, logging with SLF4J, exception handling, and JUnit/Mockito-based unit testing.

## Features

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

## Prerequisites

- **Java:** Version 11 or higher.
- **Spring Boot:** Version 3.0 or later.
- **Database:** H2 (development), MySQL (production).
- **Build Tool:** Maven or Gradle.
- **IDE:** IntelliJ IDEA, Eclipse, or equivalent.

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/your-username/department-management-api.git
cd department-management-api
```

### Configure the Database

Modify the `application.properties` or `application.yml` to configure the H2 or MySQL database.

#### For H2 Database:
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

#### For MySQL Database:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/department_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
```


## Running the Application

### Build and Run

#### With Maven:

```bash
mvn clean install
mvn spring-boot:run
```

### Test the API

- **Default Base URL:** `http://localhost:8082/departments`

#### Example Endpoints:

| Method | Endpoint       | Description                        |
|--------|----------------|------------------------------------|
| GET    | /              | Fetch all departments              |
| GET    | /{id}          | Fetch department by ID             |
| GET    | /name/{name}   | Fetch department by name           |
| POST   | /              | Create a new department            |
| PUT    | /{id}          | Update an existing record          |
| DELETE | /{id}          | Delete a department by ID          |

## Advanced Features

- **Hibernate Validation**  
  Validates inputs using annotations like `@NotNull`, `@Size`, and `@Email`.

- **SLF4J Logging**  
  Ensures detailed logging across layers.

- **Global Exception Handling**  
  Centralized exception handling using `@ControllerAdvice`.

- **Profiles**  
  Configures profiles for dev and prod environments.

- **Testing**  
  - **Controller Layer:** Tested using MockMvc.
  - **Service Layer:** Tested with Mockito.
  - **Repository Layer:** Verified with in-memory database tests.
 
  ### Run tests with:
```bash
mvn test
```

## Building the Executable JAR

To build the JAR file:
```bash
mvn package
```
The JAR file will be located in the `target` directory:
```bash
target/Spring-boot-rest-1.0.0.jar
```
Run the JAR file with:
```bash
java -jar target/Spring-boot-rest-1.0.0.jar
```

## Contribution

Contributions are welcome! If you'd like to improve this project:

1. Fork the repository.
2. Create a new branch for your feature.
3. Commit your changes.
4. Open a pull request.

## Contact

For feedback or questions, contact:

- **Email**: vedantmahakal@gmail.com
- **GitHub**: [Vedant1808](https://github.com/Vedant1808)










