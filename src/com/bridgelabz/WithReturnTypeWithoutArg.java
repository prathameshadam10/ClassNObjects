package com.bridgelabz;

public class WithReturnTypeWithoutArg {
     public static void main(String[] args) {
       int z, x;
        z = addition();
        x = addition2();
        System.out.println("Sum1 :" + z);
        System.out.println("sum2 :" + x);
    }
    public static int addition(){
         int a=125, b=275, c;
         c=a+b;
        return c;

    }
    public static int addition2(){
         int a=75, b=225, c;
        c=a+b;
        return c;
    }
}
