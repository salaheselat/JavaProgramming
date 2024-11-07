package Functions;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Update this to latest version functions !
        displayMenu();
    }


    static void displayMenu(){

        int select = 0;
        while (select != 5) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Select on of the following options");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.println("Select a number");
            select = scanner.nextInt();



            // Adding option 1
            if (select ==1){
                System.out.println("Enter first number: ");
                int num1 =scanner.nextInt();
                System.out.println("Enter second number: ");
                int num2 =scanner.nextInt();
                int sum = num1 + num2;
                System.out.println("Sum is : "+ num1 + " + " +num2 + " = " + sum);

            // Subtraction option 2
            } else if (select ==2) {
                System.out.println("Enter first number: ");
                int num1 =scanner.nextInt();
                System.out.println("Enter second number: ");
                int num2 =scanner.nextInt();
                int sum = num1 - num2;
                System.out.println("Sum is : "+ num1 + " - " +num2 + " = " + sum);


             // Multiplication option 3
            } else if (select == 3) {
                System.out.println("Enter first number: ");
                int num1 =scanner.nextInt();
                System.out.println("Enter second number: ");
                int num2 =scanner.nextInt();
                int sum = num1 * num2;
                System.out.println("Sum is : "+ num1 + " X " +num2 + " = " + sum);

            } else if (select == 4) {
                System.out.println("Enter first number: ");
                int num1 =scanner.nextInt();
                System.out.println("Enter second number: ");
                int num2 =scanner.nextInt();
                int sum = num1 / num2;
                System.out.println("Sum is : "+ num1 + " / " +num2 + " = " + sum);

            } else {
                System.out.println("Bye! you have selected to exit calculator");
            }
        }
    }


}
