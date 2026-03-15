package streams;

import java.util.ArrayList;
import java.util.List;
import arraylist02.Student;

public class StudentAnalytics {

    // Learning goal: build simple stream pipelines for filtering, mapping, averaging, and sorting.
    // Backend connection: these operations are common when transforming data before returning it from a service or API.

    public void printStudentWithGradeAbove(List<Student> students, double grade){
        // Review note: this method demonstrates filtering a collection by a business rule.
        // A future improvement is returning the filtered data instead of printing it directly.
        students.stream()
                .filter(student -> student.getGrade() > grade)
                .forEach(System.out::println);
    }

    public void calculateAverageGrade(List<Student> students){
        double average = students.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0);
        System.out.println(average);

    }

    public void getStudentNames(List<Student> students){
        // this method demonstrates mapping objects into one specific field.
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);
    }

    public void sortStudentsByGrade(List<Student> students){
        // this method demonstrates ordering data before consuming it.
        // Later you can try reversing the order or collecting the sorted result into a new list.
        students.stream()
                .sorted((s1, s2) -> Double.compare(s1.getGrade(), s2.getGrade()))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        // datos de prueba
        students.add(new Student("Ana", 20, 8,1));
        students.add(new Student("Luis", 22, 7,2));
        students.add(new Student("Maria", 19, 9,3));
        students.add(new Student("Carlos", 21, 6,4));
        students.add(new Student("Laura", 23, 10,5));

        StudentAnalytics analytics = new StudentAnalytics();

        // Main is acting as a manual test for each stream exercise.
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
