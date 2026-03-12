package arraylist02;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    private void addStudent(Student newStudent){students.add(newStudent);}

    private void removeStudent(String name){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals(name)){
                students.remove(i);
                break;
            }
        }
    }

    private Student findStudent(String name){
        for (Student s : students){
            if (s.getName().equals(name)){
                return s;
            }
        }
        return null;
    }

    private double averageGrade(){
        double resultado=0;
        for(Student s : students){
            resultado+=s.getGrade();
        }

        return resultado/students.size();
    }

    public static void main(String[] args){
        StudentManager manager = new StudentManager();
        Student s1 = new Student("Ana", 20, 8);
        Student s2 = new Student("Luis", 22, 7);
        Student s3 = new Student("Maria", 19,9);

    }


}
