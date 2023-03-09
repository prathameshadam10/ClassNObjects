package com.bridgelabz;

import java.util.Scanner;

class Circle{
    int radius;
    public void areaOfCircle(){
        double area = 3.14 * radius * radius;
        System.out.println( "Area of circle :" + area);
    }
    public void circumferenceOfCircle(){
        double circumference = 2 * 3.14 * radius;
        System.out.println("circumference of circle :" + circumference);
    }

}
public class CircleProperties {
    public static void main(String[] args) {
        Circle c = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of Circle :");
        c.radius = sc.nextInt();
        c.areaOfCircle();
        c.circumferenceOfCircle();
    }
}
