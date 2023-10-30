package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int zero = 0;
        while(zero<=printTillInclusive)
        {
            if(zero%2==0)
              System.out.println(zero);
            zero++;
        }
    }
}
