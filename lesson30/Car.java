package com.company.lesson30;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;


public class Car {
    String model;
    String color;
    double engine;

    Car(String model,String color,double engine){
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString(){
        return "Our Car is "+ model + ", color is "+ color + " and engine= " + engine;
    }
}


class Test10{
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            al.add(carSupplier.get());
        }
        return al;
    }

//    public static void changeCar(Car car, Consumer<Car> carConsumer){
//        carConsumer.accept(car);
//    }



    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() ->
                new Car("Nissan gt","red",2.0));
        System.out.println("ourCars: "+ourCars);
//
//        changeCar(ourCars.get(0),car ->
//        {car.color = "white";
//        car.engine = 2.4;
//        System.out.println("updeted car: " + car);
//        });
        Consumer<Car>carConsumer=car ->
        {car.color = "white";
        car.engine = 2.4;
        System.out.println("updeted car: " + car);
        };
        carConsumer.accept(ourCars.get(0));

        System.out.println("outCars" + ourCars);
    }
}