package com.Sb101;

import java.util.Scanner;

public class Day2 {
	public static void main(String args[]){ 
		
	System.out.println("start of main..");
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter num1");
    int num1;
    try {
        num1 = sc.nextInt();
    } catch (Exception e) {
        System.out.println("Please enter a valid number");
        System.out.println("End of main");
        return;
    }

    System.out.println("Enter num2");
    int num2;
    try {
        num2 = sc.nextInt();
        if (num2 == 0) {
            throw new ArithmeticException();
        }
    } catch (ArithmeticException e) {
        System.out.println("num2 should not be 0");
        System.out.println("End of main");
        return;
    } catch (Exception e) {
        System.out.println("Please enter a valid number");
        System.out.println("End of main");
        return;
    }

    String message = null;
    int num3;
    try {
        num3 = num1 / num2;
        if (num3 > 10) {
            message = "Welcome to Exception Handling";
        }
    } catch (Exception e) {
        System.out.println("String value is null");
        System.out.println("End of main");
        return;
    }

    System.out.println("Message is: " + message.toUpperCase());
    System.out.println("End of main");
    
	} 
	}



