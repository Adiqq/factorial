package com.factorial;

public class Factorial {
    public static int calculate(int factorialForNumber){
        if(factorialForNumber <= 1){
            return 1;
        }
        return factorialForNumber * calculate(factorialForNumber - 1);
    }
}
