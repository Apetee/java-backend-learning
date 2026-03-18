package generics;

import arraylist02.Student;

public class Box<T> {
    private T value;

    public Box(T value){
        this.value=value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isEmpty(){
        if (value == null) return true;
        else return false;
    }
    public void clear(){

    };

    public static void main() {
        Box<String> boxString=new Box<>("Andres");
        Box<Integer> boxInteger=new Box<>(10);
        Box<Student> boxStudent = new Box<>(new Student("TestGeneric", 10, 5, 10));

        System.out.println("Test Generic box for Strings");
        System.out.println(boxString.getValue());
        System.out.println("Test Generic box for Integers");
        System.out.println(boxInteger.getValue());
        System.out.println("Test Generic box for Students");
        System.out.println(boxStudent.getValue());
    }
}
