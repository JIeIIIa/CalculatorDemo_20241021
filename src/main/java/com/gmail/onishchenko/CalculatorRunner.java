package com.gmail.onishchenko;

import com.gmail.onishchenko.homework.SimpleCalculator;

import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: a = ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number: b = ");
        double b = scanner.nextDouble();

        SimpleCalculator calculator = new SimpleCalculator();
        System.out.println("a + b == " + calculator.sum(a, b));
        System.out.println("a - b == " + calculator.subtract(a, b));
        System.out.println("a * b == " + calculator.divide(a, b));
        System.out.println("a / b == " + calculator.multiply(a, b));
    }
}
