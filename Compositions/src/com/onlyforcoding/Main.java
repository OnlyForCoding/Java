package com.onlyforcoding;

public class Main {

    public static void main(String[] args) {

        Case theCase = new Case("342S","Dell", "220V",
                new Dimentions(12,12,6));
        Monitor monitor = new Monitor("12inch LED","LENOVO",27,
                new Resolution(1080,720));
        Motherboard motherboard = new Motherboard("512","ASUS",2,
                4,"v5.55");
        PC thePC = new PC(theCase,monitor,motherboard);
        //thePC.getTheCase().pressPowerButton();
        //thePC.getMonitor().drawPixelAt(34,54,"yellow");
        //thePC.getMotherboard().loadProgram("Ubuntu 14.04LTS");
        thePC.powerUp();
    }
}
