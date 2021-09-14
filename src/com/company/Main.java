/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String s1 = x.nextLine();
        Integer num1 = null;
        try {
            num1 = Integer.valueOf(s1);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integers please.");
            System.exit(0);
        }
        System.out.print("What is the second number? ");
        String s2 = x.nextLine();
        Integer num2 = null;
        try {
            num2 = Integer.valueOf(s2);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integers please.");
            System.exit(0);
        }
        System.out.print("What is the third number? ");
        String s3 = x.nextLine();
        Integer num3 = null;
        try {
            num3 = Integer.valueOf(s3);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integers please.");
            System.exit(0);
        }

        if(num1!=num2 && num2!=num3 && num3!=num1){
            if(num1>num2 && num1>num3){
                System.out.println("The largest number is "+num1+".");
            }else if(num2>num1 && num2>num3){
                System.out.println("The largest number is "+num2+".");
            }else if(num3>num2 && num3>num1){
                System.out.println("The largest number is "+num3+".");
            }
        }else{
                System.out.println("Invalid Entry, try making all the numbers different.");
                System.exit(0);
        }

        System.exit(0);
    }
}
