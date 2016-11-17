package com.factorial;

public class Main {

    public static void main(String[] args) {
        int factorialForNumber = Integer.parseInt(args[0]);
        int s = factorial(factorialForNumber);
        System.out.println(s);
    }

    public static int factorial(int factorialForNumber){
        if(factorialForNumber <= 1){
            return 1;
        }
        return factorialForNumber * factorial(factorialForNumber - 1);
    }
}
