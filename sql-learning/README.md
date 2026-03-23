# SQL Learning Setup

This folder gives you a repo-local PostgreSQL practice environment.

What is included:
- `docker-compose.yml` to run PostgreSQL locally
- `init/01_schema.sql` to create tables
- `init/02_seed.sql` to insert starter data
- `queries/01_practice_queries.sql` with first practice prompts

Prerequisite:
- Install Docker Desktop on your machine

How to start:
1. Open a terminal in `sql-learning`
2. Run `docker compose up -d`
3. Wait until the container is healthy

Connection details:
- Host: `localhost`
- Port: `55432`
- Database: `backend_learning`
- User: `backend_user`
- Password: `backend_pass`

How to connect:
- Use DBeaver, pgAdmin, or another SQL client
- Connect with the values above

How initialization works:
- The scripts in `init/` run automatically the first time the container starts
- If you want a full reset, run `docker compose down -v` and then `docker compose up -d` again

Why this helps with Spring Boot:
- `students` is like an entity table
- `courses` is another entity table
- `enrollments` teaches table relationships and joins
- This is the same data model style you will later use with JDBC and Spring Data JPA
