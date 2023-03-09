package com.bridgelabz;

import java.util.Scanner;

class Dog{
    String breed;
    int age, weight;

    public void calculateAge(){
        age = age * 5;
        System.out.println("The dog's age in human years is :" + age);
    }
    public  void  display(){
        System.out.println("Breed of the dog is : "+breed);
        System.out.println("Age of the dog is : "+age);
        System.out.println("weight of the dog is :"+weight);
    }
}
public class DogInfo {
    public static void main(String[] args) {
        Dog d = new Dog();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breed :");
        d.breed = sc.nextLine();
        System.out.println("Enter age :");
        d.age = sc.nextInt();
        System.out.println("Enter weight :");
        d.weight = sc.nextInt();
        d.calculateAge();
        d.display();
    }
}
