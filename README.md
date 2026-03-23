# Java Backend Learning Journey

This repository documents my path from Java fundamentals to Java backend development.

My goal is to build a strong foundation in core Java first, then progress into real backend technologies such as Spring Boot, REST APIs, SQL databases, testing, Docker, and microservices.

## Current Status

I am learning Java backend development step by step through small exercises, mini-projects, and now a local SQL practice environment.

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
- Interfaces
- Generics basics
- Enums basics
- Date/time API basics
- File I/O basics
- PostgreSQL setup with Docker

### Current focus
I am currently moving into SQL and data persistence:
- working with PostgreSQL in a local Docker environment
- querying `students`, `courses`, and `enrollments`
- practicing `SELECT`, `WHERE`, `ORDER BY`, `INSERT`, `UPDATE`, and `DELETE`
- preparing for `JOIN`, `GROUP BY`, and JDBC

### Next immediate step
Practice SQL until CRUD and joins feel natural, then continue with:
- SQL relationships and normalization
- `JOIN`, `COUNT`, `AVG`, and `GROUP BY`
- JDBC
- Maven
- JUnit
- Spring Boot

Still planned from Java core:
- `BigDecimal`
- `Comparable` and `Comparator`

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
    interfaces/
    generics/
    enums/
    dates/
    fileio/
    hashmap/
    streams/
    exceptions/
  sql-learning/
    init/
    queries/
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
| Interfaces | `java-fundamentals/interfaces/StudentStorage.java` | Shared contract between multiple implementations |
| Generics | `java-fundamentals/generics/Box.java` | Type parameters and reusable typed containers |
| Enums | `java-fundamentals/enums/StudentStatus.java` | Fixed set of domain states |
| Date/Time API | `java-fundamentals/dates/StudentRecord.java` | `LocalDate`, `LocalDateTime`, `Period`, formatting |
| File I/O | `java-fundamentals/fileio/StudentFilePractice.java` | Reading files, CSV parsing, validation, and writing output |
| SQL Schema | `sql-learning/init/01_schema.sql` | Tables, keys, relationships, and starter schema design |
| SQL Practice | `sql-learning/queries/01_practice_queries.sql` | Filtering, CRUD queries, joins, and aggregates |

## Why These Topics Matter for Backend Development

These exercises are not isolated practice. Each one connects to real backend work:

- variables and objects become request data, entities, and DTOs
- arrays and collections become in-memory data handling
- CRUD logic becomes service and repository logic
- HashMap practice helps understand key-based access and lookup patterns
- streams help transform and filter data before returning API responses
- exceptions become validation errors and not-found errors in backend applications
- interfaces help separate contracts from implementations
- generics help build reusable, type-safe code
- enums model controlled business states like status values
- date/time API is essential for timestamps, scheduling, and deadlines
- file I/O helps prepare for imports, exports, logs, and configuration files
- SQL turns in-memory CRUD practice into real database persistence

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

Current phase: entering SQL practice with PostgreSQL + Docker.

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
- interface-based student storage contract
- generic box practice
- enum practice
- date/time student record practice
- file I/O student CSV practice
- local PostgreSQL SQL sandbox

### Planned mini-projects
- `LibraryManager`
- `ExpenseTracker`
- `StudentRegistrationJDBC`
- `TaskManagerAPI`
- `OrderManagementAPI`
- `AuthAPI`

## Current Learning Checkpoint

If I return to this repository later, I should continue from here:

1. Practice SQL daily against the `backend_learning` database
2. Get very comfortable with `SELECT`, `WHERE`, `ORDER BY`, `INSERT`, `UPDATE`, and `DELETE`
3. Learn joins using `students`, `courses`, and `enrollments`
4. Move into JDBC with a `StudentRegistrationJDBC` mini-project
5. Add Maven project structure before starting Spring Boot

## How To Continue Helping Me In Future Sessions

If a future conversation starts from this README, the best way to help me is:

- explain concepts step by step
- connect each topic to backend development
- prefer project-based exercises instead of pure theory
- let me write code myself first
- review my code and suggest improvements
- help me build toward Spring Boot in the correct order
- for SQL, use the existing local PostgreSQL setup before introducing ORM tools

## Running the Exercises

For now, this repository contains both Java exercises and a local SQL practice setup.

Typical workflow:
- open the project in IntelliJ IDEA
- open a class with a `main` method
- run that class to test the exercise
- refactor and improve step by step
- commit progress to GitHub

SQL workflow:
- open `sql-learning/`
- start the database with `docker compose up -d`
- connect with DBeaver or IntelliJ Database tools
- use host `localhost`, port `55432`, database `backend_learning`
- run scripts from `sql-learning/queries/`

Later, this repository will evolve toward Maven/Gradle-based Java database projects and then Spring Boot applications.

## Long-Term Goal

Become a strong Java backend developer capable of building:
- REST APIs with Spring Boot
- database-driven applications
- tested and maintainable backend services
- Dockerized applications
- production-ready backend systems

---

This repository is a learning journey, not just a collection of exercises. The goal is not only to make code work, but to understand how Java concepts grow into real backend development.
