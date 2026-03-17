# Java Backend Learning Journey

This repository documents my path from Java fundamentals to Java backend development.

My goal is to build a strong foundation in core Java first, then progress into real backend technologies such as Spring Boot, REST APIs, SQL databases, testing, Docker, and microservices.

## Current Status

I am currently learning Java step by step through small exercises and mini-projects.

### Topics already practiced
- Java fundamentals
- Arrays
- ArrayList
- HashMap
- Object-Oriented Programming
- Managing collections of objects
- Basic CRUD-like logic with collections
- Introduction to Java Streams
- Exceptions basics

### Current focus
I am currently practicing exceptions:
- built-in exceptions
- `try/catch`
- throwing exceptions manually with `throw`
- understanding when to use `IllegalArgumentException`
- creating my first custom exception: `StudentNotFoundException`

### Next immediate step
Apply exception handling to student-related classes and then continue with:
- interfaces
- generics
- enums
- date/time API
- `BigDecimal`
- file I/O
- SQL
- Maven
- JUnit
- JDBC
- Spring Boot

## Learning Approach

My learning style is based on:
- building small exercises and mini-projects
- writing the code myself instead of copying full solutions
- understanding each concept step by step
- using Git and GitHub to track progress
- connecting each Java topic to real backend development

## Repository Structure

```text
java-backend-learning/
  java-fundamentals/
    variables01/
    arrays04/
    arraylist02/
    hashmap/
    streams/
    exceptions/
```

## Exercises and What They Teach

| Topic | File | Main Focus |
|------|------|------------|
| Variables | `java-fundamentals/variables01/VariablesExample.java` | Basic data types and console output |
| Arrays | `java-fundamentals/arrays04/NumberAnalyzer.java` | Loops, conditions, counters, min/max, averages |
| OOP + ArrayList | `java-fundamentals/arraylist02/Student.java` | Classes, constructors, getters/setters, object modeling |
| OOP + CRUD with collections | `java-fundamentals/arraylist02/StudentManager.java` | Add, search, update, remove students |
| HashMap | `java-fundamentals/hashmap/StudentDatabase.java` | Key-based storage and retrieval by id |
| Streams | `java-fundamentals/streams/StudentAnalytics.java` | `filter`, `map`, `mapToDouble`, `average`, `sorted` |
| Exceptions | `java-fundamentals/exceptions/ExceptionPractice.java` | `try/catch`, built-in exceptions, input validation |
| Custom Exceptions | `java-fundamentals/exceptions/StudentNotFoundException.java` | First custom runtime exception |

## Why These Topics Matter for Backend Development

These exercises are not isolated practice. Each one connects to real backend work:

- variables and objects become request data, entities, and DTOs
- arrays and collections become in-memory data handling
- CRUD logic becomes service and repository logic
- HashMap practice helps understand key-based access and lookup patterns
- streams help transform and filter data before returning API responses
- exceptions become validation errors and not-found errors in backend applications

This is the foundation for future Spring Boot applications.

## Current Backend Roadmap

### Phase 1 - Strong Java Core
- exceptions
- interfaces
- generics
- enums
- `LocalDate` and `LocalDateTime`
- `BigDecimal`
- `Comparable` and `Comparator`
- file I/O

### Phase 2 - Data and Persistence
- SQL fundamentals
- table relationships
- joins
- normalization
- JDBC

### Phase 3 - Java Project Structure
- Maven
- dependency management
- project layout
- configuration files

### Phase 4 - Testing
- JUnit 5
- assertions
- unit tests
- integration test basics
- Mockito basics

### Phase 5 - Backend Fundamentals
- HTTP
- JSON
- REST APIs
- request/response structure
- status codes
- DTOs
- validation
- error handling

### Phase 6 - Spring Boot
- `@RestController`
- `@Service`
- `@Repository`
- dependency injection
- Spring Data JPA
- PostgreSQL or MySQL

### Phase 7 - Production-Oriented Skills
- Docker
- authentication and authorization basics
- pagination
- logging
- transactions
- deployment basics

### Phase 8 - Advanced Growth
- concurrency basics
- caching basics
- messaging
- microservices foundations
- system design fundamentals

## Project-Based Plan

### Already built
- variable practice
- number analyzer
- student manager
- student database
- student analytics
- exception practice

### Planned mini-projects
- `LibraryManager`
- `ExpenseTracker`
- `StudentRegistrationJDBC`
- `TaskManagerAPI`
- `OrderManagementAPI`
- `AuthAPI`

## Current Learning Checkpoint

If I return to this repository later, I should continue from here:

1. Finish exception practice completely
2. Replace generic `RuntimeException` with `StudentNotFoundException` where appropriate
3. Apply exception-based thinking to `StudentManager` and `StudentDatabase`
4. Learn interfaces and generics next
5. Move into SQL and Maven after core Java feels stable

## How To Continue Helping Me In Future Sessions

If a future conversation starts from this README, the best way to help me is:

- explain concepts step by step
- connect each topic to backend development
- prefer project-based exercises instead of pure theory
- let me write code myself first
- review my code and suggest improvements
- help me build toward Spring Boot in the correct order

## Running the Exercises

For now, this repository is a plain Java learning workspace.

Typical workflow:
- open the project in IntelliJ IDEA
- open a class with a `main` method
- run that class to test the exercise
- refactor and improve step by step
- commit progress to GitHub

Later, this repository will evolve toward Maven/Gradle-based projects.

## Long-Term Goal

Become a strong Java backend developer capable of building:
- REST APIs with Spring Boot
- database-driven applications
- tested and maintainable backend services
- Dockerized applications
- production-ready backend systems

---

This repository is a learning journey, not just a collection of exercises. The goal is not only to make code work, but to understand how Java concepts grow into real backend development.
