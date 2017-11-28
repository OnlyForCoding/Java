package com.onlyforcoding;

/**
 * Created by jitendra on 27/11/17.
 */
public class Dog extends Animal {

    private int eyes;
    private int teeth;
    private int legs;
    private int tail;
    private String coat;

    public Dog(String name, int size, int weight,
               int eyes, int teeth, int legs, int tail, String coat) {
        super(name, 1, 1, size, weight);
        this.coat = coat;
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
    }

    @Override
    public void eat() {
        chew();
        System.out.println("Dog.eat() called");
        super.eat();
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    public void walk(int speed){
        System.out.println("Dog.walk() called");
        move(speed);
    }

    public void run(int speed){
        System.out.println("Dog.run() called");
        move(speed);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
