package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 1;

        while(number<=printToInclusive)
        {
            int check=number;
            while(check>0)
            {
                if(number%check==0)
                {
                    if(check==1)
                        System.out.println(number);
                    check--;
                }
                else
                    break;

            }
            number++;
        }
    }
}
