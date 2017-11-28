package com.onlyforcoding;

/**
 * Created by jitendra on 28/11/17.
 */
public class Car {

    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public void startEngine(){
        System.out.println("Car.startEngine() called");
    }

    public void accelerate(){
        System.out.println("Car.accelerate() callled");
    }

    public void brake(){
        System.out.println("Car.brake() called");
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("mistubishi --> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("mistubishi --> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("mistubishi --> brake()");
    }
}
