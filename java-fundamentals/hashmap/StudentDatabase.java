package hashmap;
import java.util.HashMap;
import arraylist02.Student;

public class StudentDatabase {
    // Learning goal: use key-based storage to find data faster than scanning a full list.
    // Backend connection: this is similar to storing and querying records by an identifier.

    // Review note: the key is the student name, so names are treated as unique here.
    // If the same name is added again, the previous value is replaced.
    // Also remember that HashMap does not guarantee iteration order.
    private HashMap<Integer , Student> mapaEstudiantes = new HashMap<>();

    // Review note: adding with an existing key replaces the previous student.
    public void addStudent(Student newStudent){mapaEstudiantes.put(newStudent.getId(), newStudent);}

    // Review note: because this structure is key-based, removing by name may feel more natural than removing by object.
    public void removeStudent(Student newStudent){mapaEstudiantes.remove(newStudent.getId());}

    // If the student does not exist, this returns null.
    // Later you can compare this style with validation or exception-based handling.
    public Student findStudent(int id){
        return mapaEstudiantes.get(id);
    }

    // Review note: this prints all stored students, but the order is not fixed.
    public void printStudents(){
        for (Student s : mapaEstudiantes.values())
            System.out.println(s.toString());
    }
}
