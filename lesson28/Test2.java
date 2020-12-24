package com.company.lesson28;

public class Test2 {
    Car c = Car.createCar();
}


class Car{
    private Car(){}
    static Car createCar(){return new Car();}
}