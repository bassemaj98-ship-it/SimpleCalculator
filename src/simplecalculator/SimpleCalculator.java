/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecalculator;

import java.util.Scanner;


public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        // إدخال الرقمين
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        // العمليات الحسابية
        double sum = a + b;
        double difference = a - b;
        double division = 0;

        // التحقق من القسمة على صفر
        if (b != 0) {
            division = a / b;
        } else {
            System.out.println("Cannot divide by zero!");
        }

        // عرض النتائج
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        if (b != 0) {
            System.out.println("Division: " + division);
        }

        scanner.close();
    }

}

