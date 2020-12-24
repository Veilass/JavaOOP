package com.company.lesson28;

import java.time.*;

public class Test5 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2011,6,1,6,3);
        LocalDate start = LocalDate.of(2001, Month.SEPTEMBER,1);
//        Period p = Period.ofMonths(3).ofDays(10);
        LocalTime lt = LocalTime.of(10,30);
        Period p = Period.ofMonths(3);
        p = Period.ofDays(10);
        Duration d = Duration.ofMinutes(3);
        System.out.println(ldt.plus(d).plus(p));
    }
}
