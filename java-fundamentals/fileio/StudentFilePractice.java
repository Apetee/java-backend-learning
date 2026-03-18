package fileio;

import arraylist02.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class StudentFilePractice {
    public static void main(String[] args) {
        Path path = Path.of("java-fundamentals", "fileio", "data", "practice-notes.txt");
        Path pathCSV = Path.of("java-fundamentals", "fileio", "data", "students.csv");
        Path pathInvalid = Path.of("java-fundamentals", "fileio", "data", "students-invalid.csv");
        Path output = Path.of("java-fundamentals", "fileio", "data", "practice-output.txt");

        System.out.println("---Print the whole txt---");
        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Fail reading file: " + e.getMessage());
        }

        System.out.println("---Print line by line---");
        try {
            List<String> lineByLine = Files.readAllLines(path);
            for (int i = 0; i < lineByLine.size(); i++) {
                System.out.println("Line: " + (i + 1) + ", " + lineByLine.get(i));
            }
            System.out.println("Total Lines: " + lineByLine.size());
        } catch (IOException e) {
            System.out.println("Fail line by line: " + e.getMessage());
        }

        System.out.println("---Print csv file---");
        try {
            List<String> linesCSV = Files.readAllLines(pathCSV);
            System.out.println("Header: " + linesCSV.get(0));

            List<Student> students = new ArrayList<>();
            for (int i = 1; i < linesCSV.size(); i++) {
                Student student = parseStudentLine(linesCSV.get(i), i + 1);
                students.add(student);
            }

            System.out.println("---Print all the students---");
            for (Student student : students) {
                System.out.println(student);
            }
            System.out.println("Total students: " + students.size());

            writeSummary(output, students);
            appendLine(output, "Generated from: students.csv");
            appendLine(output, "Output file checked successfully.");
            System.out.println("practice-output.txt created successfully.");

            System.out.println("---Read practice-output.txt---");
            System.out.println(Files.readString(output));
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Cannot read the file: " + e.getMessage());
        }

        System.out.println("---Print csv-invalid data---");
        try {
            List<String> invalidLines = Files.readAllLines(pathInvalid);
            System.out.println("Header: " + invalidLines.get(0));

            List<Student> validStudents = new ArrayList<>();
            int invalidRows = 0;

            for (int i = 1; i < invalidLines.size(); i++) {
                String line = invalidLines.get(i);

                try {
                    Student student = parseStudentLine(line, i + 1);
                    validStudents.add(student);
                    System.out.println("Loaded valid row: " + student);
                } catch (IllegalArgumentException e) {
                    invalidRows++;
                    System.out.println("Skipped line " + (i + 1) + ": " + e.getMessage());
                }
            }

            System.out.println("Valid rows: " + validStudents.size());
            System.out.println("Invalid rows: " + invalidRows);
        } catch (IOException e) {
            System.out.println("Cannot read invalid CSV file: " + e.getMessage());
        }
    }

    public static Student parseStudentLine(String line, int lineNumber) {
        String[] parts = line.split(",", -1);

        if (parts.length != 4) {
            throw new IllegalArgumentException("Invalid column count at line " + lineNumber + ": " + line);
        }

        String idText = parts[0].trim();
        String name = parts[1].trim();
        String ageText = parts[2].trim();
        String gradeText = parts[3].trim();

        if (name.isEmpty()) {
            throw new IllegalArgumentException("Student name is empty.");
        }

        try {
            int id = Integer.parseInt(idText);
            int age = Integer.parseInt(ageText);
            double grade = Double.parseDouble(gradeText);
            return new Student(name, age, grade, id);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid numeric value: " + line);
        }
    }

    public static void writeSummary(Path output, List<Student> students) throws IOException {
        double totalGrades = 0.0;
        for (Student student : students) {
            totalGrades += student.getGrade();
        }

        double averageGrade = students.isEmpty() ? 0.0 : totalGrades / students.size();
        String summary = "Student File I/O Summary" + System.lineSeparator()
                + "Total students: " + students.size() + System.lineSeparator()
                + "Average grade: " + averageGrade + System.lineSeparator();

        Files.writeString(output, summary);
    }

    public static void appendLine(Path output, String text) throws IOException {
        Files.writeString(output, text + System.lineSeparator(), StandardOpenOption.APPEND);
    }
}
