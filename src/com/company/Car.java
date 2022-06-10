package com.company;

public class Car {
    private int id;
    private int carNumber;

    public Car(int id, int carNumber) {
        this.id = id;
        this.carNumber = carNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car: " +
                "id=" + id +
                ", carNumber=" + carNumber;
    }
}
