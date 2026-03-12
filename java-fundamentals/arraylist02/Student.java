package arraylist02;

public class Student {
    private String name;
    private int age, grade;

    Student(){
        name="";
        age=grade=0;
    }
    public Student(String n,int a,int g){
        name=n;
        age=a;
        grade=g;
    }

    public void setName(String name){
        this.name= name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public int getGrade(){return this.grade;}

    public String getStudent(){
        String resultado = name+" | "+"Age: "+age+" | Grade:"+grade;
        return resultado;
    }

}
