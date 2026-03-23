select s.full_name, c.title
from enrollments e
join students s on e.student_id = s.id
join courses c on e.course_id = c.id;

SELECT c.title, COUNT(*) AS total_enrollments
FROM enrollments e
         JOIN courses c ON e.course_id = c.id
GROUP BY c.title
ORDER BY total_enrollments DESC;
