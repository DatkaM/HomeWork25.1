package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    /**
     * Car деген класс тузунуз (Id, номер авто)
     * Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
     * HashMap тузунуз ключ - машина, маани - машинанын данныйлары
     * HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.
     */
    public static void main(String[] args) {
        Map<Car,DataOfCar> hashMap = new HashMap<>();
        hashMap.put(new Car(7,2013),new DataOfCar(2022,"Camry70",10000,"Black"));
        hashMap.put(new Car(1,2282),new DataOfCar(2012,"VW",12000,"Grey"));
        hashMap.put(new Car(2,1283),new DataOfCar(2000,"Lexus",6000,"White"));
        hashMap.put(new Car(3,729),new DataOfCar(2020,"Honda",20000,"Red"));

        for (Map.Entry map:hashMap.entrySet()) {
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}
