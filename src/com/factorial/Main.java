package com.factorial;

public class Main {

    public static void main(String[] args) {
        int factorialForNumber = Integer.parseInt(args[0]);
        int s = Factorial.calculate(factorialForNumber);
        System.out.println(s);
    }

}
