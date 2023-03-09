package com.bridgelabz;

import java.util.Scanner;

class Student {
    String name;
    int age, iD;

    public void printInfo (int iD, int age, String name){
        System.out.println(  "Name of the student is :" + name);
        System.out.println( "Age of the Student is :" + age);
        System.out.println( "ID of the Student is :" + iD);
    }
}
public class StudentClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student obj = new Student();
        System.out.println("Enter the name of the student :-");
        obj.name = sc.nextLine();
        System.out.println("Enter age of the student :-");
        obj.age = sc.nextInt();
        System.out.println("Enter iD of the student :-");
        obj.iD = sc.nextInt();
        obj.printInfo(obj.iD, obj.age, obj.name);



    }
}
