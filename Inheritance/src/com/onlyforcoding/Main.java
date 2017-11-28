package com.onlyforcoding;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal",1,1,1,5);
        Dog dog = new Dog("Juffy",8,34,2,25,4,1,"Silky");
        //dog.eat();
        //dog.walk(4);
        //dog.run(25);

        Fish fish = new Fish("fish 1",1,12,2,2,3);
        fish.move(12);
    }
}
