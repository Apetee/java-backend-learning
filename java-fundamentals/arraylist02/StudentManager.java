package arraylist02;

import streams.StudentAnalytics;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    // This class is starting to behave like a service layer.
    // In a future Spring Boot app, logic like this usually lives in a service that talks to a repository.

    // This list is your in-memory data store for now.
    // Later in backend development, this idea connects to a database table.
    public StudentAnalytics analytics = new StudentAnalytics();
    public ArrayList<Student> students = new ArrayList<>();

    // Review note: these methods are private now because main is inside the same class.
    // If you want to use StudentManager from another class later, the main operations will likely need to be public.

    // Purpose: add a new student to the collection.
    // Next thing to think about: should two students with the same name be allowed?
    // If not, this method will need a validation rule before adding.
    public void addStudent(Student newStudent){students.add(newStudent);}
    public void addStudents(ArrayList<Student> students){
        this.students=students;
    }

    // Purpose: remove a student by name.
    // Current behavior: removes the first student whose name matches.
    // Edge case to review: what should happen if the name does not exist?
    // Design question: later you may want this method to report success or failure.
    public void removeStudent(int id){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getId() == id){
                students.remove(i);
                break;
            }
        }
    }

    // Purpose: search for one student by name.
    // Current behavior: returns the Student if found, otherwise returns null.
    // This is a good step toward backend thinking because searching data is a core service task.
    // Later you can compare returning null vs throwing an exception vs using Optional.
    public Student findStudent(int id){
        for (Student s : students){
            if (s.getId() == id){
                return s;
            }
        }
        return null;
    }

    // Purpose: calculate the average grade of all stored students.
    // Important edge case: if the list is empty, dividing by zero will fail.
    // Before moving on, make sure this method handles the empty list safely.
    // Try to keep this method focused on calculating and returning the value.
    public double averageGrade(){
        double resultado=0;
        if (students != null){
            for(Student s : students){
                resultado+=s.getGrade();
            }
        }else {
            return 0;
        }

        return resultado/students.size();
    }

    // Good next methods to add in this step:
    // - list all students
    public void listAllStudents(){
        analytics.getStudentNames(students);
    }
    // - update a student's grade by name
    public void updateGrade(int id, double val){
        //First check if student exist
        Student student = this.findStudent(id);
        //Once its exist added the val to the current grade
        if ((student != null ) && (val > 0.0 && student.getGrade() > val)){
            student.setGrade(val+student.getGrade());
            System.out.println("Success!");
        } else {
            System.out.println("Student doesn't exist or update not necessary");
        }
    }
    // - count total students
    public int totalStudents(){return students.size();}

    public static void main(String[] args){
        // 1. create students
        Student s1 = new Student("Ana", 20, 8, 1);
        Student s2 = new Student("Luis", 22, 7, 2);
        Student s3 = new Student("Maria", 19,9, 3);
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);students.add(s2);students.add(s3);

        // 2. add them to the manager
        StudentManager manager = new StudentManager();
        manager.addStudents(students);

        // 3. list all students
        manager.listAllStudents();

        // 4. search for one student
        System.out.println("One student: " + manager.findStudent(s1.getId()) );

        // 5. update one student
        System.out.println("Current grade of: " + s1.getName()+": "+s1.getGrade()+", plus 0.1");
        manager.updateGrade(s1.getId(), 0.1);
        System.out.println("After update: " + s1.getGrade());

        // 6. remove one student
        manager.listAllStudents();
        System.out.println("Remove student:"+s2.getId());
        manager.removeStudent(s2.getId());
        manager.listAllStudents();

        // 7. calculate the average grade
        manager.addStudent(s2);
        System.out.println("Average grade:"+manager.averageGrade());

        // 8. test a case where the student does not exist
        manager.updateGrade(123,0.5);


    }


}
