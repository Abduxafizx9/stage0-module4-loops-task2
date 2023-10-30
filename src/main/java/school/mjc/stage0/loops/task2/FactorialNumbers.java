package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int beginning = 0;
        int factorial = 1;
        while (beginning <= printToInclusive) {
            factorial *= beginning;
            if (beginning == 0)
                factorial = 1;
            System.out.println(factorial);
            beginning++;
        }
    }

}
