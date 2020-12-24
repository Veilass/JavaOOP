package com.company.lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test5 {
}


class Student{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student(String name,  char sex, int age, int course, double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent(Student st) {
        System.out.println("Name students: " + st.name + ", " + "sex: " + st.sex + ", age: " + st.age + ", course: "
                + st.course + ", avg grade: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student> aL, Predicate<Student> t){
        for (Student s: aL){
            if(t.test(s)){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan",'m',21,3,8.6);
        Student st2 = new Student("Nikolay",'m',19,1,7.5);
        Student st3 = new Student("Dasha",'f',20,2,9.2);
        Student st4 = new Student("leonid",'m',22,4,6.8);
        Student st5 = new Student("Mariy",'f',23,5,7);
        list.add(st1); list.add(st2); list.add(st3); list.add(st4); list.add(st5);
        StudentInfo si = new StudentInfo();
        for(Student s : list) {
            System.out.println(s.name);
        }
            System.out.println("---------------------------------------");
            list.removeIf(x-> x.name.endsWith("a"));
            for (Student s : list){
                System.out.println(s.name);
            }

//        si.testStudents(list, (Student st) -> {return st.avgGrade > 8.5;});
//        System.out.println("--------------------------------------------");
//        si.testStudents(list, st -> st.avgGrade < 9);
//        System.out.println("--------------------------------------------");
//        si.testStudents(list, (Student st) ->  st.age > 23);
//        System.out.println("--------------------------------------------");
//        si.testStudents(list, (Student st) -> {return st.age < 23;});
//        System.out.println("--------------------------------------------");
//        si.testStudents(list, (Student st) -> {return st.sex == 'm';});
//        System.out.println("--------------------------------------------");
//        si.testStudents(list, (Student st) -> {return st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f';});
    }
}
