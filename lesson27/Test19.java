package com.company.lesson27;

import java.io.IOException;

public class Test19 {
    public static void main(String[] args) {
        Animal2 a = new Mouse();
        try {
            a.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Animal2{
    void run() throws IOException {
        System.out.println("Animal runs");
    }
}

class Mouse extends Animal2{
    void run() throws ArrayIndexOutOfBoundsException{
        System.out.println("Mouse runs");
    }
}
