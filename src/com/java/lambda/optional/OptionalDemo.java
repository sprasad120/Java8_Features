package com.java.lambda.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        String email = null;
        // of, empty, ofNullable
//        Optional<Object> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional);
//
//        Optional<String> emailOptional = Optional.of(email);
//        System.out.println(emailOptional);

        Optional<String> stringOptional = Optional.ofNullable(email);
        String defaultOptional = stringOptional.orElse("default@gmail.com");
        System.out.println(defaultOptional);

        String defaultOptional2 = stringOptional.orElseGet(() -> "default@gmail.com");
        System.out.println(defaultOptional2);

//        String optionalObject = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email does not exist"));
//        System.out.println(optionalObject);

        // ifPresent
        Optional<String> gender = Optional.of("Male");
        Optional<String> emptyOptional = Optional.empty();

        gender.ifPresent((s) -> System.out.println("value is present"));

//        if(stringOptional.isPresent()) {
//            System.out.println(stringOptional.get());
//        } else {
//            System.out.println("no value present");
//        }

        String result = " abc ";
        if(result != null && result.contains("abc")) {
            System.out.println(result);
        }

        Optional<String> optionalStr = Optional.of(result);
        optionalStr.filter(res -> res.contains("abc"))
                .map(String::trim)
                .ifPresent((res)-> System.out.println(res));

        //map method in Optional provides a way to transform value in Optional from one type to another.

    }
}
