package com.factorial;

public class Main {

    public static void main(String[] args) {
        int factorialForNumber = Integer.parseInt(args[0]);
        int s = 1;

        for(int i = 1; i <= factorialForNumber; i++){
            s *= i;
        }
        System.out.println(s);
    }
}
