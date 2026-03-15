package arrays04;

public class NumberAnalyzer {

    // Learning goal: practice loops, conditions, counters, and basic calculations over arrays.
    // Backend connection: this is an early version of data processing before working with collections and streams.

    public static void main(String[] args) {

        // Review note: this logic assumes the array has at least one value.
        // A strong next step is handling the empty-array case before reading the first position.

        int[] numbers = {5,8,2,10,3};

        int max = numbers[0];
        int min = numbers[0];
        int auxP = 0;
        int auxI = 0;
        int sum = 0;

        int[] par = new int[numbers.length];
        int[] impar = new int[numbers.length];

        for(int i = 0 ; i < numbers.length ; i++){

            if(numbers[i] > max) max = numbers[i];
            if(numbers[i] < min) min = numbers[i];

            if(numbers[i] % 2 == 0){
                par[auxP++] = numbers[i];
            }else{
                impar[auxI++] = numbers[i];
            }

            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        // Review note: this method call is only for printing.
        // Later you can separate calculation from presentation even more clearly.
        resultado(max, min, average, par, impar);
    }

    public static void resultado(int max, int min, double ave, int[] p, int[] i){

        // Review note: this method is focused on output.
        // A future refactor could use smaller methods or a result object to keep responsibilities cleaner.
        // Also review how zero is used here, because zero is a valid number and may be hidden by the current checks.

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + ave);

        System.out.println("Pares:");
        for(int h = 0; h < p.length; h++)
            if(p[h] != 0)
                System.out.println(p[h]);

        System.out.println("Impares:");
        for(int j = 0; j < i.length; j++)
            if(i[j] != 0)
                System.out.println(i[j]);
    }
}
