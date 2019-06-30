package com.stackroute.javeexercise2;

public class PowerOfFour {
    public String checkPower(int n)
    {
        if(n == 0)
            return "false";
        while(n != 1)
        {
            if(n % 4 != 0)
                return "false";
            n = n / 4;
        }
        return "true power of 4";

    }
}
