package arraylist02;

public class Student {
    // This class is your domain model.
    // In backend applications, classes like this often represent entities, DTOs, or request/response models.
    private String name;
    private int age, id;
    private double grade;

    // Review note: decide whether creating an empty student should be allowed.
    // If every student should always have data, later you may prefer using only the full constructor.
    public Student(){
        setName("#");
        setAge(1);
        setGrade(0.0);
        setId(1);
    }

    // Review note: constructor parameters work, but clearer parameter names become more important as classes grow.
    public Student(String n,int a,double g, int id){
        setAge(a);
        setGrade(g);
        setName(n);
        setId(id);
    }

    // Setters are a common place for future validation rules.
    // For example, later you may want to reject negative ages or grades outside an accepted range.
    public void setName(String name){
        if (name==null)
            throw new IllegalArgumentException("Name null for setting");

        if (!name.isBlank())
            this.name= name;
        else
            throw new IllegalArgumentException("Name not valid");
    }
    public void setAge(int age) {
        if( age > 0)
            this.age = age;
        else
            throw new IllegalArgumentException("Age not valid");
    }
    public void setGrade(double grade){
        if (grade >=0 && grade <= 10)
            this.grade=grade;
        else
            throw new IllegalArgumentException("Grade not valid");
    }
    public void setId(int id){
        if (id>0)
            this.id = id;
        else
            throw new IllegalArgumentException("Invalid id");
    }
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
