package com.java.lambda.defaultstatic;

interface Vehicle {
    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn() {
        return "turning vehicle alarm on";
    }

    default String turnAlarmOff() {
        return "turning vehicle alarm off";
    }
}

class Car implements Vehicle {

    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public String speedUp() {
        return "the car is speeding up";
    }

    @Override
    public String slowDown() {
        return "the car is slowing down";
    }
}

public class DefaultDemo {
    public static void main(String[] args) {

        Vehicle vehicle = new Car();
        vehicle.getBrand();
        vehicle.speedUp();
        vehicle.slowDown();
    }
}
