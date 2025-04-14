package com.pluralsight;
import java.util.Scanner;

public class BasicCalculatorApp {
    public static void main(String [] args) {
        Scanner scanner = new Scanner ( System. in);
        System.out.print("Enter the first number:");
        float num1 = scanner.nextFloat();
        System.out.print("Enter the second number:");
        float num2 = scanner.nextFloat();
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.print("Please select an option:");
        String option = scanner.next();
        float result = num1 * num2;
        System.out.println(num1 + " * " + num2 + "=" + result);
        scanner.close();




    }
}
