package streams;

import java.util.ArrayList;
import java.util.List;
import arraylist02.Student;

public class StudentAnalytics {

    public void printStudentWithGradeAbove(List<Student> students, double grade){
        // QUE HACER AQUI:
        // Mostrar solo los estudiantes cuya nota sea mayor que el valor recibido en 'grade'.
        students.stream()
                .filter(student -> student.getGrade() > grade)
                .forEach(System.out::println);
    }

    public void calculateAverageGrade(List<Student> students){
        // QUE HACER AQUI:
        // Calcular el promedio de todas las notas y mostrarlo por consola.
        double average = students.stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0);
        System.out.println(average);

    }

    public void getStudentNames(List<Student> students){
        // QUE HACER AQUI:
        // Obtener solo los nombres de los estudiantes e imprimirlos.
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);
    }

    public void sortStudentsByGrade(List<Student> students){
        // QUE HACER AQUI:
        // Ordenar los estudiantes por nota de menor a mayor y mostrarlos.
        students.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getGrade(), s2.getGrade()))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        // datos de prueba
        students.add(new Student("Ana", 20, 8));
        students.add(new Student("Luis", 22, 7));
        students.add(new Student("Maria", 19, 9));
        students.add(new Student("Carlos", 21, 6));
        students.add(new Student("Laura", 23, 10));

        StudentAnalytics analytics = new StudentAnalytics();

        //EJEMPLOS DE LLAMADAS:
        System.out.println("--- Students with grade above 7 ---");
        analytics.printStudentWithGradeAbove(students, 7);

        System.out.println("--- Average grade ---");
        analytics.calculateAverageGrade(students);

        System.out.println("--- Student names ---");
        analytics.getStudentNames(students);

        System.out.println("--- Students sorted by grade ---");
        analytics.sortStudentsByGrade(students);
    }
}
