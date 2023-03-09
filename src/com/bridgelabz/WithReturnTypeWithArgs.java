package com.bridgelabz;

public class WithReturnTypeWithArgs {
    public static void main(String[] args) {
        int z, x;
        z = addition(125, 275);
        x = addition2(75, 225);
        System.out.println("Sum1 :" + z);
        System.out.println("sum2 :" + x);
    }

    public static int addition(int a, int b) {
        int c = a + b;
        return c;

    }

    public static int addition2(int a, int b) {
        int c = a + b;
        return c;
    }
}
