//package com.company.lesson29;
//
//import java.util.ArrayList;
//
//public class Test1 {
//}
//
//
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
//class StudentInfo{
//    void printStudent(Student st){
//        System.out.println("Name students: " + st.name +", " + "sex: " + st.sex + ", age: "+ st.age + ", course: "
//                + st.course + ", avg grade: " + st.avgGrade);
//    }
//    void printStudentsOverGrade(ArrayList<Student>aL, double avgGrade){
//        for (Student st:aL){
//            if(st.avgGrade > avgGrade){
//                printStudent(st);
//            }
//        }
//    }
//
//    void printStudentsUnderGrade(ArrayList<Student>aL, double avgGrade){
//        for (Student st:aL){
//            if(st.avgGrade < avgGrade){
//                printStudent(st);
//            }
//        }
//    }
//
//    void printStudentsOverAge(ArrayList<Student>aL, int age){
//        for (Student st:aL){
//            if(st.age > age){
//                printStudent(st);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student>aL, int age){
//        for (Student st:aL){
//            if(st.age < age){
//                printStudent(st);
//            }
//        }
//    }
//
//    void printStudentsBySex(ArrayList<Student>aL, char sex){
//        for (Student st:aL){
//            if(st.sex == sex){
//                printStudent(st);
//            }
//        }
//    }
//
//    void printStudentsMixConditions(ArrayList<Student>aL, double avgGrade,int age,char sex){
//        for (Student st:aL){
//            if(st.avgGrade > avgGrade && st.age < age && st.sex == sex){
//                printStudent(st);
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
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//        StudentInfo si = new StudentInfo();
//
//        si.printStudentsOverGrade(list,8.5);
//        System.out.println("-------------------------------------------------------------");
//        si.printStudentsUnderGrade(list,9);
//        System.out.println("-------------------------------------------------------------");
//        si.printStudentsOverAge(list,21);
//        System.out.println("-------------------------------------------------------------");
//        si.printStudentsUnderAge(list,27);
//        System.out.println("-------------------------------------------------------------");
//        si.printStudentsBySex(list,'m');
//        System.out.println("-------------------------------------------------------------");
//        si.printStudentsMixConditions(list,7.2,23,'f');
//    }
//}