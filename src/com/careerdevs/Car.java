package com.careerdevs;

public class Car {
    // Create the following fields:
    //make (String)
    //model (String)
    //isRented (boolean)
    //[Heads up: this class will be expanded with many more fields later on)
    //Create a constructor that uses on the fields of Car
    //Create a toString method (you can use IntelliJ’s generator)

//    private String make;
//    private String model;
//    private boolean isRented;
//
//    public Car(String make, String model) {
//        this.make = make;
//        this.model = model;
//        this.isRented = false;
//    }

//    public String getMake() {
//        return make;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public String getName() {
//        return getMake() + " " + getModel();
//    }
//
//    public void setRented(boolean rented) {
//        isRented = rented;
//    }
//
//    public boolean isRented() {
//        return isRented;
//
//
//    }
    public String make;
    public String model;
    public boolean isRented;

    public Car(String make, String model, boolean isRented) {
        this.make = make;
        this.model = model;
        this.isRented = isRented;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}
