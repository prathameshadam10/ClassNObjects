package com.bridgelabz;

public class AdditionWithMuitipleMethods {
    public void ad(int a, int b){
        int c=a+b;
        System.out.println("Sum :" + c);
    }

    public static void main(String[] args) {
        AdditionWithMuitipleMethods addition = new AdditionWithMuitipleMethods();
        AdditionWithMuitipleMethods addition2 = new AdditionWithMuitipleMethods();
        addition.ad(10, 20);
        addition2.ad(638, 78);
    }
}
