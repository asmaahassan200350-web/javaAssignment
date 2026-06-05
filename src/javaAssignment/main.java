package javaAssignment;

import java.util.Scanner;

import static javaAssignment.NumberAnalyzer.*;

public class main {
    static void main() {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                printNumbersDescending();

            } else if (choice == 2) {

                printEvenOrOdd();

            } else if (choice == 3) {

                System.out.print("Enter a number: ");
                int number = input.nextInt();

                System.out.println(checkNumberType(number));

            } else if (choice == 4) {

                System.out.print("Enter first number: ");
                int number1 = input.nextInt();

                System.out.print("Enter second number: ");
                int number2 = input.nextInt();

                System.out.println("Sum = " + calculateSum(number1, number2));

            } else if (choice == 5) {

                System.out.println("Thank you for using Number Analyzer.");

            } else {

                System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        input.close();
    }
}






