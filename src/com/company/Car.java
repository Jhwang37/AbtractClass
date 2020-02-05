package com.company;

public class Car extends Vehicle {
    private String model;
    private String make;
    private int year;

    public Car(String model, String make, int year){
        this.model = model;
        this.make = make;
        this.year = year;
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());

        accelerate(90);
        stopCar(true);
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
