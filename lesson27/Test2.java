package com.company.lesson27;

public class Test2 {
    public static void main(String[] args) {
        int array[] = {1,5,0};
        String s = null;

           try {
               if(5 >= 0 && 5 < array.length) {
                   System.out.println(array[5]);
               }
           }catch (ArrayIndexOutOfBoundsException e){
               System.out.println("Exception caught");
           }



    }
}
