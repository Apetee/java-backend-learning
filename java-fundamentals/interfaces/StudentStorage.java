package interfaces;

import arraylist02.Student;

public interface StudentStorage {
    boolean addStudent(Student newStudent);
    boolean removeStudent(int id);
    Student findStudent(int id);
    void listAllStudents();
}
