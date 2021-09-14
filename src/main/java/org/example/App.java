 /*
  *  UCF COP3330 Fall 2021 Assignment 14 Solution
  *  Copyright 2021 Blake Baez
  */
 package org.example;
import java.util.Scanner;

public class App 
{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("What is the order amount? ");
            double order = scan.nextDouble();

            Scanner input = new Scanner(System.in);
            System.out.print("What is the state? ");
            String state = input.nextLine();

            double tax = 5.5/10;

            if(state.equalsIgnoreCase("WI")) {

                double total = order + tax;

                System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.", order, tax, total);
                System.exit(0);
            }

            System.out.printf("The total is $%.2f.", order);
        }
    }
