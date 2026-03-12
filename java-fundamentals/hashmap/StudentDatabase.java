package hashmap;
import java.util.HashMap;
import arraylist02.Student;

/*
* METODOS BASICOS HASMAP
*   put(key, value) mapaEstudiantes.put("Ana", new Student("Ana", 20,8)) // mapaEstudiantes.puts(s.getName(),s)
*   get(key) Student s = mapaEstudiantes.get("Ana"); Si no existe devuelve null
*   remove(key) mapaEstudiantes.remove("Ana")
*   containsKey(key)  if(mapaEstudiantes.containsKey("Ana")){System.out.println("Existe el estudiante");}
*   values() devuelve todos los valores del mapa.
*       for(Student s : mapaEstudiantes.values()){
            System.out.println(s);
         }
*   mapaEstudiantes.size()
*   mapaEstudiantes.clear()
* */
public class StudentDatabase {
    private HashMap<String , Student> mapaEstudiantes = new HashMap<>();

    public void addStudent(Student newStudent){mapaEstudiantes.put(newStudent.getName(), newStudent);}
    public void removeStudent(Student newStudent){mapaEstudiantes.remove(newStudent.getName());}
    public Student findStudent(String name){
        return mapaEstudiantes.get(name);
    }
    public void printStudents(){
        for (Student s : mapaEstudiantes.values())
            System.out.println(s.toString());
    }
}
