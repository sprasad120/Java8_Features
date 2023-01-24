package com.java.lambda.functional;

//traditional way

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String> {


    @Override
    public void accept(String input) {
        System.out.println(input);
    }
}


public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer<String> consumer = new ConsumerImpl();
//        consumer.accept("Hello World!");

        Consumer<String> consumer = (input) -> System.out.println(input);
        consumer.accept("Hello World!");
    }
}
