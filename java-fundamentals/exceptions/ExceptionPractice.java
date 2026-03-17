package exceptions;

public class ExceptionPractice {
    // Learning order for exceptions:
    // 1. Observe a built-in exception.
    // 2. Handle it with try/catch.
    // 3. Throw an exception yourself for invalid input.
    // 4. Understand when a method should signal an error instead of failing silently.
    // 5. Move the same idea into StudentManager and StudentDatabase.

    // Keywords to learn first:
    // - try: the block where a risky operation runs.
    // - catch: the block that handles the problem.
    // - throw: create and launch an exception yourself.
    // - throws: declares that a method may pass an exception to whoever calls it.

    public static void main(String[] args) {
        ExceptionPractice practice = new ExceptionPractice();

        try{
            practice.validateGradeIncrement(-1);
        } catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }

        try {
            System.out.println(practice.divide(1,1));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(practice.parseNumber("a"));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public int divide(int firstNumber, int secondNumber) {
        // Practice flow:
        // 1. Implement a normal integer division.
        // 2. Test a valid case first.
        // 3. Test a case where the second number is zero.
        // 4. Observe the exception name and message.
        if (secondNumber==0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return firstNumber / secondNumber;
    }

    public int parseNumber(String text) {
        // Goal:
        // Practice a second built-in exception using text conversion.

        // What to learn here:
        // - valid numeric text can become a number
        // - invalid text should cause a conversion failure
        // - this is useful because backend applications often receive text input

        // Practice flow:
        // 1. Convert a valid numeric string.
        // 2. Test a string that is not a number.
        // 3. Compare the success case with the failure case.
        int n;
        try{
            n = Integer.parseInt(text);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("Text wasn't a number");
        }
        return n;
    }

    public void validateGradeIncrement(double increment) {
        // Rule for this exercise:
        // - a grade increment must be greater than zero

        // Practice flow:
        // 1. Start with a valid increment.
        // 2. Test zero.
        // 3. Test a negative value.
        // 4. First use IllegalArgumentException for this rule.
        if (increment<=0){
            throw new IllegalArgumentException("The increment must be greater than zero");
        }

    }

    public String searchStudentMessage(int id) {
        // Goal:
        // Prepare for the "student not found" problem in your student classes.

        // What to learn here:
        // - missing data is a normal backend situation
        // - you need to decide whether to return a value, return null, or raise an exception
        // - later you can replace this idea with StudentNotFoundException

        // Practice flow:
        // 1. Simulate one id that exists.
        // 2. Simulate one id that does not exist.
        // 3. Decide how you want the method to signal the missing case.
        // 4. Compare that choice with how StudentManager behaves today.

        if (id == 1) {
            return "Student with id 1 found.";
        }

        throw new RuntimeException("Student not found.");
    }
}
