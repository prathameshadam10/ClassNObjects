package com.bridgelabz;
class Pen {
    String color;
    String type;

    public void write (){
        System.out.println("Write Something :");
    }
    public  void printColor(){
        System.out.println(this.color);
    }
}
public class Oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "BallPoint";

        pen1.printColor();
        pen2.printColor();

    }

}
