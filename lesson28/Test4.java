package com.company.lesson28;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Test4 {
    static void changeDuty(LocalDate start, LocalDate finish, Period p) {
        LocalDate data = start;
        while (data.isBefore(finish)){
            System.out.println("Came data " + data + " it's time to change Duty");
            data = data.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(20,30);

        LocalDate start = LocalDate.of(2020, Month.SEPTEMBER,1);
        LocalDate finish = LocalDate.of(2024,Month.MAY,31);
        Period p = Period.of(1,3,15);
        changeDuty(start,finish, p);
    }
}
