package com.bridgelabz;

import java.util.Scanner;

 class Employee {
    String name;
    int iD, salary;
    long totalSalary;
    public void employeesYearlySalary (int salary){
        // sal = 1 month
        //total sal is 12 month

        totalSalary =salary*12;


    }

    public void printEmpInfo (){
        System.out.println("name of the Employee is :" + name );
        System.out.println("Total salary of the Employee :" + totalSalary);
        System.out.println("ID of the Employee :" + iD);
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Employee :");
        e.name= sc.nextLine();
        System.out.println("Enter the Salary of Employee :");
        e.salary = sc.nextInt();
        System.out.println("Enter iD of Employee :");
        e.iD = sc.nextInt();
        e.employeesYearlySalary(e.salary);
        e.printEmpInfo();


    }
}
