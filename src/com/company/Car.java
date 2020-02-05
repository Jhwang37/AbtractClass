package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Car extends Vehicle {
    private String model;
    private String make;
    private int year;
    Scanner scan = new Scanner(System.in);
    int x = 0;
    private ArrayList<String> carList = new ArrayList<String>();

    public Car(){
        addCar();

//        accelerate(90);
//        stopCar(true);
    }

    public void addCar(){
        while(x <= 5){
            try {
            System.out.println("Enter the make of your car: ");
            this.make = scan.nextLine();
            System.out.println("Enter the model of your car: ");
            this.model = scan.nextLine();
            System.out.println("Enter the year of your car: ");
            this.year = scan.nextInt();
            scan.nextLine();
            String car = "Make: " + make + "\nModel: " +
                    model + "\nYear:" + year;
            carList.add(car);
            printCar(carList);
            x++;
        }catch (Exception e){
            System.out.println("Enter valid input");
        }
        }

    }
    public void printCar(ArrayList<String> carList){
        for(String x : carList){
            System.out.println("=======");
            System.out.println(x);
            System.out.println("=======");
        }

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
