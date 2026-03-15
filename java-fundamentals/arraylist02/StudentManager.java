package arraylist02;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    // This class is starting to behave like a service layer.
    // In a future Spring Boot app, logic like this usually lives in a service that talks to a repository.
    private final ArrayList<Student> students = new ArrayList<>();

    // Current rule: repeated names are allowed, but repeated ids are not.
    public boolean addStudent(Student newStudent) {
        if (newStudent == null || findStudent(newStudent.getId()) != null) {
            return false;
        }

        students.add(newStudent);
        return true;
    }

    public void addStudents(List<Student> students) {
        if (students == null) {
            return;
        }

        for (Student student : students) {
            addStudent(student);
        }
    }

    // Purpose: remove a student by id.
    public boolean removeStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return true;
            }
        }

        return false;
    }

    // Purpose: search for one student by id.
    // Current behavior: returns the Student if found, otherwise returns null.
    public Student findStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    // Purpose: calculate the average grade of all stored students.
    // If the collection is empty, this returns 0.0 to avoid dividing by zero.
    public double averageGrade() {
        if (students.isEmpty()) {
            return 0.0;
        }

        double total = 0;
        for (Student student : students) {
            total += student.getGrade();
        }

        return total / students.size();
    }

    public void listAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Purpose: increase the current grade by the received amount.
    public boolean updateGrade(int id, double increment) {
        Student student = findStudent(id);

        if (student == null || increment <= 0.0) {
            return false;
        }

        student.setGrade(student.getGrade() + increment);
        return true;
    }

    public int totalStudents() {
        return students.size();
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ana", 20, 8, 1);
        Student s2 = new Student("Luis", 22, 7, 2);
        Student s3 = new Student("Maria", 19, 9, 3);
        Student s4 = new Student("Ana", 24, 8.5, 4);

        StudentManager manager = new StudentManager();

        System.out.println("--- Add students ---");
        System.out.println("Add Ana (id 1): " + manager.addStudent(s1));
        System.out.println("Add Luis (id 2): " + manager.addStudent(s2));
        System.out.println("Add Maria (id 3): " + manager.addStudent(s3));
        System.out.println("Add Ana (id 4): " + manager.addStudent(s4));
        System.out.println("Add duplicate id 1: " + manager.addStudent(new Student("Pedro", 18, 6.5, 1)));

        System.out.println();
        System.out.println("--- List all students ---");
        manager.listAllStudents();

        System.out.println();
        System.out.println("--- Find one student ---");
        System.out.println("Student with id 1: " + manager.findStudent(1));
        System.out.println("Student with id 99: " + manager.findStudent(99));

        System.out.println();
        System.out.println("--- Update grade ---");
        System.out.println("Before update: " + manager.findStudent(1));
        System.out.println("Update id 1 by +0.1: " + manager.updateGrade(1, 0.1));
        System.out.println("After update: " + manager.findStudent(1));
        System.out.println("Update missing student: " + manager.updateGrade(99, 0.5));
        System.out.println("Update with invalid increment: " + manager.updateGrade(1, -0.2));

        System.out.println();
        System.out.println("--- Remove student ---");
        System.out.println("Remove id 2: " + manager.removeStudent(2));
        System.out.println("Remove missing id 99: " + manager.removeStudent(99));
        manager.listAllStudents();

        System.out.println();
        System.out.println("--- Totals and average ---");
        System.out.println("Total students: " + manager.totalStudents());
        System.out.println("Average grade: " + manager.averageGrade());
    }
}
