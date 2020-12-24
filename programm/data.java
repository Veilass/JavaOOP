package programm;

import java.io.Serializable;
import java.util.Scanner;

public class data implements Serializable {
    Scanner input = new Scanner(System.in);

    String name,log,hob;
    int age;

    public void name1() throws InterruptedException {
        synchronized (this) {
            System.out.print("Введите имя: ");
            name = input.nextLine();
        }
    }

    public void log1() throws InterruptedException {
        synchronized (this) {
            System.out.print("Введите логин: ");
            log = input.nextLine();
        }
    }

    public void age1() throws InterruptedException {
        synchronized (this) {
            System.out.print("Введите возраст: ");
            age = input.nextInt();
        }
    }

    public void hob1() throws InterruptedException {
        synchronized (this) {
            System.out.print("Введите хобби через запятую: ");
            hob = input.nextLine();
        }
    }

    public void output1() throws InterruptedException {
        synchronized (this) {
            System.out.print("Пользователь: " + name + " с логином: " + log + "." + " Его возраст: " + age + "." + " Все хобби:");
            System.out.println(hob);
        }
    }
}
