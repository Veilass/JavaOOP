package com.company.lesson23;

public class Test6 {

}

class Animal{


    String showName(){
        return  "some Animal";
    }

    void showInfoAboutAnimal(){
        System.out.println("Name of animal: "    + showName());
    }

}

class Mouse extends Animal{
     String showName(){
        return  "Jerry";
    }

    void showInfoAboutMouse(){
        System.out.println("Name of mouse: "    + showName());
    }

    public static void main(String[] args) {
        Mouse a = new Mouse();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}