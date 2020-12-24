 package com.company.lesson24;

 public class Test2 {
    public static void main(String[] args) {
        Figure f1 = new Square();
        System.out.println(f1.countSide);
        f1.area();
    }
}

 abstract class Figure{

     int countSide = 0;
     abstract void perimetr();
     abstract void area();
   void showInfo(){
       System.out.println("It figure");
   }
}

 class Square extends Figure{

    int side1 = 10;
    int countSide = 4;
    public void perimetr() {
        System.out.println("Perimetr sqare = " + 4*side1);
    }
    public void area(){
        System.out.println("Area sqare = " + side1 * side1);
    }
 }

 class Rectangle extends Figure{
    int countSide = 4;
    int side1 = 8;
    int side2 = 5;

    public void perimetr(){
        System.out.println("Perimetr rectangle = " + 2 * (side1+side2));
    }
    public void area(){
        System.out.println("Area rectangle = " + side1 * side2);
    }

 }

 class XXX extends Square{}

 class Circle extends Figure{

     int countSide = 0;
     int radius = 3;
     public void perimetr(){
         System.out.println("Perimetr circle = " + 2 * 3.14 * radius);
     }
     public void area(){
         System.out.println("Area circle = " + 3.14 * radius * radius);
     }

 }

 abstract class Quadrangle extends Figure{
    void def(){
        System.out.println("It quadrangle");
    }
 }
