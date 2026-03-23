INSERT INTO students (full_name, email, age) VALUES
    ('Ana Silva', 'ana@example.com', 20),
    ('Luis Gomez', 'luis@example.com', 22),
    ('Maria Lopez', 'maria@example.com', 19),
    ('Carlos Perez', 'carlos@example.com', 24);

INSERT INTO courses (title, description, price) VALUES
    ('Java Fundamentals', 'Core Java syntax and OOP basics', 49.90),
    ('SQL Basics', 'Queries, joins, and table design', 59.90),
    ('Spring Boot Starter', 'REST APIs and dependency injection', 79.90);

INSERT INTO enrollments (student_id, course_id) VALUES
    (1, 1),
    (1, 2),
    (2, 1),
    (2, 3),
    (3, 2),
    (4, 1),
    (4, 2),
    (4, 3);
