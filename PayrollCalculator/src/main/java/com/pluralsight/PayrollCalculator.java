package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        System.out.print("Enter hours worked:");
        float hoursWorked = scanner.nextFloat();
        System.out.print("Enter pay rate:");
        float payRate = scanner.nextFloat();
        float grossPay;
        if (hoursWorked > 40) {
            float regularPay = 40 * payRate;
            float overtimePay = (hoursWorked - 40) * payRate * 1.5f;
            grossPay = regularPay + overtimePay;
        } else {
            grossPay = hoursWorked * payRate;
        }
        System.out.println("Employee Name:" + name);
        System.out.println("Gross Pay: $" + grossPay);

        scanner.close();
    }
}

