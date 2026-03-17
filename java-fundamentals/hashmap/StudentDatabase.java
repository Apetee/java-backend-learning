package hashmap;
import java.util.HashMap;
import arraylist02.Student;
import exceptions.StudentNotFoundException;
import interfaces.StudentStorage;

public class StudentDatabase implements StudentStorage {
    // Learning goal: use key-based storage to find data faster than scanning a full list.
    // Backend connection: this is similar to storing and querying records by an identifier.

    // Review note: the key is the student id, so ids are treated as unique here.
    // Also remember that HashMap does not guarantee iteration order.
    private HashMap<Integer , Student> mapaEstudiantes = new HashMap<>();

    @Override
    public boolean addStudent(Student newStudent){
        if (newStudent == null || mapaEstudiantes.containsKey(newStudent.getId())) {
            throw new IllegalArgumentException("NewStudent not valid for adding");
        }
        mapaEstudiantes.put(newStudent.getId(), newStudent);
        return true;
    }

    // Review note: because this structure is key-based, removing by id may feel more natural than removing by object.
    @Override
    public boolean removeStudent(int id){
        if (id <= 0) {
            throw new IllegalArgumentException("Id not valid");
        }
        if (!mapaEstudiantes.containsKey(id)) {
            throw new StudentNotFoundException();
        }
        mapaEstudiantes.remove(id);
        return true;
    }

    // If the student does not exist, this returns null.
    // Later you can compare this style with validation or exception-based handling.
    @Override
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
    @Override
    public void listAllStudents(){
        for (Student s : mapaEstudiantes.values())
            System.out.println(s.toString());
    }
}
