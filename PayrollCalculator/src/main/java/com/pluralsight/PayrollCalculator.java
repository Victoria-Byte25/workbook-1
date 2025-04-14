package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get user input
        String name = getEmployeeName(scanner);
        float hoursWorked = getHoursWorked(scanner);
        int payRate = getPayRate(scanner);

        // 2. Calculate gross pay
        float grossPay = calculateGrossPay(hoursWorked, payRate);

        // 3. Print results
        printResults(name, grossPay);

        scanner.close();
    }

    public static String getEmployeeName(Scanner scanner) {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    public static float getHoursWorked(Scanner scanner) {
        System.out.print("Enter hours worked: ");
        return scanner.nextFloat();
    }

    public static int getPayRate(Scanner scanner) {
        System.out.print("Enter pay rate: ");
        return scanner.nextInt();
    }

    public static float calculateGrossPay(float hoursWorked, float payRate) {
        if (hoursWorked > 40) {
            float regularPay = 40 * payRate;
            float overtimePay = (hoursWorked - 40) * payRate * 1.5f;
            return regularPay + overtimePay;
        } else {
            return hoursWorked * payRate;
        }
    }

    public static void printResults(String name, float grossPay) {
        System.out.println("Employee Name: " + name);
        System.out.println("Gross Pay: $" + grossPay);
    }
}
