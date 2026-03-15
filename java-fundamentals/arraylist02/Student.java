package arraylist02;

public class Student {
    // This class is your domain model.
    // In backend applications, classes like this often represent entities, DTOs, or request/response models.
    private String name;
    private int age, id;
    private double grade;

    // Review note: decide whether creating an empty student should be allowed.
    // If every student should always have data, later you may prefer using only the full constructor.
    Student(){
        name="";
        age=0;
        grade = 0.0;
        id=0;
    }

    // Review note: constructor parameters work, but clearer parameter names become more important as classes grow.
    public Student(String n,int a,double g, int id){
        name=n;
        age=a;
        grade=g;
        this.id=id;
    }

    // Setters are a common place for future validation rules.
    // For example, later you may want to reject negative ages or grades outside an accepted range.
    public void setName(String name){
        this.name= name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGrade(double grade){
        this.grade=grade;
    }
    public void setId(int id){this.id = id;}
    public int getId(){return this.id;}
    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public double getGrade(){return this.grade;}

    @Override
    public String toString(){
        // Useful for manual testing, debugging, and logging.
        String resultado = name+" | "+"Age: "+age+" | Grade:"+grade+" | Id: "+id;
        return resultado;
    }

}
