package javaAssignment;

public class NumberAnalyzer {

    //Prints numbers from 10 down to 1.
    public static void printNumbersDescending() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

         //Prints numbers from 1 to 10 and shows if each number is even or odd

        public static void printEvenOrOdd() {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " -> Even");
                } else {
                    System.out.println(i + " -> Odd");
                }
            }
        }

           //Determines whether the given number is positive, negative, or zero

         public static String checkNumberType(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

     // Calculates the sum of two integer numbers
    public static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }


    }



