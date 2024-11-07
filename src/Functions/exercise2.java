package Functions;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
//        displayNumber(3);
//        displaySquareOfNumberEntred();
//        displayCountDown();
//        displayCalculatedSum();

    }

    // Display
    static void displayNumber(int number){
        System.out.println(number);
    }

    // Function to calculate the square root of a given number
    static void displaySquareOfNumberEntred(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to calculate it's square root");
        Double number = scanner.nextDouble();

        double square = number * number; // Calculate square
        System.out.println("The square of " + number + " is: " + square);

        // different way of calculating square root
//        Double number = scanner.nextInt();
//        double result = Math.sqrt(number);
//        System.out.println("You entered " + number + " And the square root = " + result);
    }

    static void displayCountDown(){
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
    }

    // Function to calculate addition of three given numbers entered by the user
    static void displayCalculatedSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value 1");
        int number1 = scanner.nextInt();

        System.out.println("Enter a value 2 ");
        int number2 = scanner.nextInt();

        System.out.println("Enter a value 3 ");
        int number3 = scanner.nextInt();

        int sum = number1 + number2 + number3;
        System.out.println("Result = " + number1 + " + " + number2 + " + " + number3 + " = " + sum);
    }
}
