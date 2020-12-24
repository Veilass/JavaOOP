package com.company.lesson26;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red","v4");
        Car c2 = null;
        Car c3 = new Car("black","v8");
        ArrayList<Car>list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        Car c4 = new Car("black","v8");
        System.out.println(list.toString());
    }

}

class Car{
    String color;
    String engine;
    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c = (Car)obj;
            return color.equals(c.color) && engine.equals(c.engine);
        }
        return false;
        }

        public String toString(){
        return "Car color " + color + " and engine " + engine;
        }
    }

