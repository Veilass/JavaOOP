//package com.company.lesson29;

import java.util.ArrayList;

//public class Test2 {
//}


//
//class Student{
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//    Student(String name,  char sex, int age, int course, double avgGrade){
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfo {
//    void printStudent(Student st) {
//        System.out.println("Name students: " + st.name + ", " + "sex: " + st.sex + ", age: " + st.age + ", course: "
//                + st.course + ", avg grade: " + st.avgGrade);
//    }
//
//    void testStudents(ArrayList<Student>aL,StudentCheks sc){
//        for (Student s: aL){
//            if(sc.test(s)){
//                printStudent(s);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<>();
//        Student st1 = new Student("Ivan",'m',21,3,8.6);
//        Student st2 = new Student("Nikolay",'m',19,1,7.5);
//        Student st3 = new Student("Dasha",'f',20,2,9.2);
//        Student st4 = new Student("leonid",'m',22,4,6.8);
//        Student st5 = new Student("Mariy",'f',23,5,7);
//        list.add(st1); list.add(st2); list.add(st3); list.add(st4); list.add(st5);
//        StudentInfo si = new StudentInfo();
//        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
//        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
//        FindStudentsOverAge fsoa = new FindStudentsOverAge();
//        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
//        FindStudentsBySex fsbs = new FindStudentsBySex();
//        FindStudentsMixCondition fsmx = new FindStudentsMixCondition();
//
//
//        si.testStudents(list, fsog);
//        System.out.println("--------------------------------------------");
//        si.testStudents(list, fsug);
//        System.out.println("--------------------------------------------");
//        si.testStudents(list, fsoa);
//        System.out.println("--------------------------------------------");
//        si.testStudents(list, fsua);
//        System.out.println("--------------------------------------------");
//        si.testStudents(list, fsbs);
//        System.out.println("--------------------------------------------");
//        si.testStudents(list, fsmx);
//    }
//}
//
//interface StudentCheks{
//    boolean test(Student s);
//}
//
//class FindStudentsOverGrade implements StudentCheks{
//    public boolean test(Student s){
//        return s.avgGrade > 8.5;
//    }
//}
//
//class FindStudentsUnderGrade implements StudentCheks{
//    public boolean test(Student s){
//        return s.avgGrade < 9;
//    }
//}
//
//class FindStudentsOverAge implements StudentCheks{
//    public boolean test(Student s){
//        return s.age > 22;
//    }
//}
//
//class FindStudentsUnderAge implements StudentCheks{
//    public boolean test(Student s){
//        return s.age < 22;
//    }
//}
//
//class FindStudentsBySex implements StudentCheks{
//    public boolean test(Student s){
//        return s.sex == 'm';
//    }
//}
//
//class FindStudentsMixCondition implements StudentCheks{
//    public boolean test(Student s){
//        return (s.avgGrade > 7.2 && s.age < 22 && s.sex == 'f');
//    }
//}