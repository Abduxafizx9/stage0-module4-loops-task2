package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int beginning = 1;
        if(printToInclusive>0) {
            int factorial = 1;
            while (beginning <= printToInclusive) {
                factorial *= beginning;
                System.out.println(factorial);
                beginning++;
            }
        }
        else
            System.out.println("1");


    }
}
