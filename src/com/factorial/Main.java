package com.factorial;

public class Main {

    public static void main(String[] args) {
        int factorialForNumber = Integer.parseInt(args[0]);
        int s = factorial(factorialForNumber);
        System.out.println(s);
    }

    public static int factorial(int factorialForNumber){
        int s = 1;
        for(int i = 1; i <= factorialForNumber; i++){
            s *= i;
        }
        return s;
    }
}
