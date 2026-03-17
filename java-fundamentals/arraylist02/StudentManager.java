package arraylist02;

import exceptions.StudentNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private final ArrayList<Student> students = new ArrayList<>();

    public boolean addStudent(Student newStudent) {
        if (newStudent == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }

        for (Student student : students) {
            if (student.getId() == newStudent.getId()) {
                throw new IllegalArgumentException("Student id already exists.");
            }
        }

        students.add(newStudent);
        return true;
    }

    public void addStudents(List<Student> students) {
        if (students == null || students.isEmpty()) {
            throw new IllegalArgumentException("Student list cannot be null or empty.");
        }

        for (Student student : students) {
            addStudent(student);
        }
    }

    public boolean removeStudent(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Id must be greater than zero.");
        }

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return true;
            }
        }
        throw new StudentNotFoundException();
    }

    public Student findStudent(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Id must be greater than zero.");
        }

        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        throw new StudentNotFoundException();
    }

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

    public boolean updateGrade(int id, double increment) {
        if (increment <= 0.0) {
            throw new IllegalArgumentException("Increment must be greater than zero.");
        }

        Student student = findStudent(id);

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
        try {
            System.out.println("Add Ana (id 1): " + manager.addStudent(s1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Add Luis (id 2): " + manager.addStudent(s2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Add Maria (id 3): " + manager.addStudent(s3));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Add Ana (id 4): " + manager.addStudent(s4));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Add duplicate id 1: " + manager.addStudent(new Student("Pedro", 18, 6.5, 1)));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("--- List all students ---");
        try {
            manager.listAllStudents();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("--- Find one student ---");
        try {
            System.out.println("Student with id 1: " + manager.findStudent(1));
        } catch (IllegalArgumentException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Student with id 99: " + manager.findStudent(99));
        } catch (IllegalArgumentException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("--- Update grade ---");
        try {
            System.out.println("Before update: " + manager.findStudent(1));
        } catch (IllegalArgumentException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Update id 1 by +0.1: " + manager.updateGrade(1, 0.1));
        } catch (IllegalArgumentException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("After update: " + manager.findStudent(1));
        } catch (IllegalArgumentException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Update missing student: " + manager.updateGrade(99, 0.5));
        } catch (IllegalArgumentException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Update with invalid increment: " + manager.updateGrade(1, -0.2));
        } catch (IllegalArgumentException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("--- Remove student ---");
        try {
            System.out.println("Remove id 2: " + manager.removeStudent(2));
        } catch (IllegalArgumentException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Remove missing id 99: " + manager.removeStudent(99));
        } catch (IllegalArgumentException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            manager.listAllStudents();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("--- Totals and average ---");
        System.out.println("Total students: " + manager.totalStudents());
        try {
            System.out.println("Average grade: " + manager.averageGrade());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
