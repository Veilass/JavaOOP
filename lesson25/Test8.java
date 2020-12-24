package com.company.lesson25;

public class Test8 {
}

class Test1 implements int1,int2{
    public void abc(){
        System.out.println("OK");
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(((int2)t).a);
        ( (int1) t).abc();
    }
}
interface int1{
    int a = 5;
    void abc();
}
interface int2{
    int a = 10;
    void abc();
}


