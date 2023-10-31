package school.mjc.stage0.loops.task2;

import java.sql.SQLOutput;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power>=0)
        {
            int i = 0;
            int result = 1;
            while(i<power)
            {
                if(i==0)
                    result=1;
                else
                    result*=2;
                System.out.println(result);
                i++;
            }

        }
        else
            System.out.println("too much power");

    }
}
