package arraylist02;

import java.util.ArrayList;

public class StudentManager {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("Ana", 20, 8);
        Student s2 = new Student("Luis", 22, 7);
        Student s3 = new Student("Maria", 19,9);
        students.add(s1);
        students.add(s2);
        students.add(s3);

        for(Student s : students){
            System.out.println(s.toString());
        }
    }
}
