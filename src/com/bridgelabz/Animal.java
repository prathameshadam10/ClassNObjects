package com.bridgelabz;

import java.util.Scanner;

public class Animal {
    int size;
    double speed = 20.50, weight;
    String colour = "Blue", sound;
    public void dogHasColour(String colour){
        System.out.println("The Colour of Dog is :" + colour);
    }
    public void tigerHasSpeed(){
        System.out.println("The Speed of the tiger is :" + speed);
    }

    public static void main(String[] args) {
        Animal obj = new Animal();
//        Scanner sc = new Scanner(System.in);
//        String colour = sc.next();

        obj.dogHasColour(obj.colour);
        obj.tigerHasSpeed();
    }

}
