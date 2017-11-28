package com.onlyforcoding;

/**
 * Created by jitendra on 28/11/17.
 */
public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimentions dimentions;

    public Case(String model, String manufacturer, String powerSupply, Dimentions dimentions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimentions = dimentions;
    }

    public void pressPowerButton(){
        System.out.println("Power button Pressed...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimentions getDimentions() {
        return dimentions;
    }
}
