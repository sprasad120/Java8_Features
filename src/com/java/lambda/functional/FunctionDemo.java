package com.java.lambda.functional;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionDemo {

    public static void main(String[] args) {
//        Function<String, Integer> function = new FunctionImpl();
//        System.out.println(function.apply("Sai Prasad"));
        Function<String, Integer> function =  (String s) -> s.length();
        System.out.println(function.apply("Sai Prasad"));
    }
}
