package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 25000.00;
        double garySalary = 44000.00;
        double highestSalary = Math.max(25000.00, 44000.00);
        System.out.println("The highest salary is: $" + highestSalary);



   //
        double carPrice = 75000.00;
        double truckPrice = 15000.00;
        double lowestPrice = Math.min(75000.00, 15000.00);
        System.out.println("The lowest vehicle price is: $" + lowestPrice);
        //
        double radius = 7.25;
        double area = Math.PI * 7.25 *7.25;
        System.out.println("The area of a circle with radius 7.25 is:" + area);

        //
        double number = 5.0;
        double squareRoot = Math.sqrt(5.0);
        System.out.println("The square root of 5.0 is" + squareRoot);

        //
        int x1 =5, y1 = 10;
        int x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2));
        System.out.println("The distance between the points is:" + distance);

        //
        double negativeValue = -3.8;
        double absolute = Math.abs(-3.8);
        System.out.println("The absolute value of -3.8 is:" + absolute);

        //
        double random = Math.random();
        System.out.println("Here's a random number between 0 and 1:" + random);

    }

    //



    }