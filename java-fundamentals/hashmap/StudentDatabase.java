package hashmap;
import java.util.HashMap;
import arraylist02.Student;
import exceptions.StudentNotFoundException;

public class StudentDatabase {
    // Learning goal: use key-based storage to find data faster than scanning a full list.
    // Backend connection: this is similar to storing and querying records by an identifier.

    // Review note: the key is the student id, so ids are treated as unique here.
    // Also remember that HashMap does not guarantee iteration order.
    private HashMap<Integer , Student> mapaEstudiantes = new HashMap<>();

    public void addStudent(Student newStudent){
        if (newStudent == null || mapaEstudiantes.containsKey(newStudent.getId())) {
            throw new IllegalArgumentException("NewStudent not valid for adding");
        }
        mapaEstudiantes.put(newStudent.getId(), newStudent);
    }

    // Review note: because this structure is key-based, removing by id may feel more natural than removing by object.
    public void removeStudent(int id){
        if (id <= 0) {
            throw new IllegalArgumentException("Id not valid");
        }
        if (!mapaEstudiantes.containsKey(id)) {
            throw new StudentNotFoundException();
        }
        mapaEstudiantes.remove(id);
    }

    // If the student does not exist, this returns null.
    // Later you can compare this style with validation or exception-based handling.
    public Student findStudent(int id){
        if (id <= 0) {
            throw new IllegalArgumentException("Id not valid");
        }
        Student estudiante = mapaEstudiantes.get(id);
        if (estudiante == null) {
            throw new StudentNotFoundException();
        }
        return estudiante;
    }

    // Review note: this prints all stored students, but the order is not fixed.
    public void printStudents(){
        for (Student s : mapaEstudiantes.values())
            System.out.println(s.toString());
    }
}
