package com.company.lesson27;

public class Test12 {
    void abc(){
        int []array = {1,2,3};
        try {
            System.out.println(array[7]);
        }catch (ArrayIndexOutOfBoundsException e){
            String s = null;
                System.out.println(s.length());
        }catch (NullPointerException e){
            System.out.println("Was NullPointerException");
        }
    }

    public static void main(String[] args) {
        Test12 t = new Test12();
        t.abc();
    }
}
