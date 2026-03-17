public class VariablesExample {

    // Learning goal: get comfortable with basic Java data types and console output.
    // Backend connection: these simple values later become object fields, request data, and database values.

    public static void main(String[] args) {

        // This exercise is intentionally simple.
        // A natural next improvement is grouping related values inside a class instead of keeping everything as local variables.

        int age = 25;
        double height = 1.78;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Andres";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + isStudent);
    }
}
