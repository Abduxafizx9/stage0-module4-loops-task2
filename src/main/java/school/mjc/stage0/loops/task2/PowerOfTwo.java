package school.mjc.stage0.loops.task2;

import java.sql.SQLOutput;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power>=0)
        {
            int i = 0;
            while(i<=power)
            {
                System.out.println(2^i);
                i++;
            }
        }
        else
            System.out.println("too much power");

    }
}
