package com.factorial;

import java.util.function.Function;

public class Main {

    static class Wrapper {
        Function<Integer, Integer> f;
    }

    public static void main(String[] args) {
        int factorialForNumber = Integer.parseInt(args[0]);
        final Wrapper w = new Wrapper();
        w.f = x -> (x == 0 ? 1 : x * w.f.apply(x - 1));
        System.out.println(w.f.apply(factorialForNumber));
    }

}
