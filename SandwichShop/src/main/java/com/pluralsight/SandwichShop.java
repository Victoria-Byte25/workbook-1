package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for sandwich size
        System.out.println("Choose your sandwich size:");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95)");
        int size = scanner.nextInt();

        double basePrice = 0;
        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid selection. Exiting.");
            return;
        }

        // Prompt for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double discount = 0;
        if (age <= 17) {
            discount = 0.10; // 10% student discount
        } else if (age >= 65) {
            discount = 0.20; // 20% senior discount
        }

        double finalPrice = basePrice - (basePrice * discount);

        System.out.printf("Your total is: $%.2f%n", finalPrice);
    }
}

