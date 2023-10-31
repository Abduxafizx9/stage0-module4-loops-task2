package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 1;

        while(number<=printToInclusive)
        {
            int check=number-1;
            while(check>0)
            {
                if(check>1)
                {if(number%check==0)
                {
                    break;
                }
                }
                else
                {
                      System.out.println(number);

                }
                check--;

             }
            number++;
        }
    }
}
