package com.company;

public class DataOfCar {
    private int year;
    private String model;
    private int price;
    private String color;

    public DataOfCar(int year, String model, int price, String color) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "   DataOfCar{ " +
                "year=" + year +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'';
    }
}
