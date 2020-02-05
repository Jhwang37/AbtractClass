package com.company;

public abstract class Boat {
    private boolean boatRegistration = false;
    private double boatCost;
    private double boatFees;
    double total;


    public void costOfBoat(double boatCost, double boatFees){
        total = boatCost + boatFees;
    }

}
