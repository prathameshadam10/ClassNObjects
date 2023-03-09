package com.bridgelabz;

import java.sql.SQLOutput;
import java.util.Scanner;

class Banking{
    int balance, accountNo, CurruntBal = 50000;
    public void deposit(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Amount to be Deposited :");
      int depoAmount = s1.nextInt();
        CurruntBal = CurruntBal + depoAmount;
        System.out.println("Your Current Balance :" + CurruntBal);
    }

    public void withdraw (){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Amount to be withdraw :");
        int WithdrawAmount = s1.nextInt();
        CurruntBal = CurruntBal - WithdrawAmount;
        System.out.println("Your Current Balance :" + CurruntBal);
    }

}

public class BankingAccount {
    public static void main(String[] args) {
        Banking ba = new Banking();
        Scanner s1 = new Scanner(System.in);
        System.out.println("What do you want \n 1) Deposit \n 2) Withdraw");
        int choice = s1.nextInt();
        switch (choice){
            case 1 :
                ba.deposit();
                break;
            case 2 :
                ba.withdraw();
                break;

        }
    }
}
