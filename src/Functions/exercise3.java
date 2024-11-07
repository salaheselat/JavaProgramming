package Functions;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {

//        displayNumber(10);


//        displayDivisionResults(10,5);

//        int startValue = 4;
//        displayCountDown(startValue);



//        String promptMessage = "Enter a number > ";
//        readNumber(promptMessage);
    }

    // Exercise 3 part 1
    // display a number by parsing it in the parameters
    static void displayNumber(int number){
        System.out.println(number);
    }

    // Exercise 3 part 2
    // Function to divide two numbers
     static void displayDivisionResults(double a, double b){
        double result = a / b;
         System.out.println("Result = " + a + " / " + b + " = " + result);


         
         // Solution by using a scanner
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a value 1");
         a = scanner.nextDouble();

         System.out.println("Enter a value 2");
         b = scanner.nextDouble();

         double divsion = a / b;
         System.out.println("Result = " + a + " / " + b + " = " + divsion);

    }



    // Exercise 3 par 3
    static void displayCountDown(int startValue) {
        for (int i = startValue; i >= 1; i--){
            System.out.println(i);
        }
    }


    // Exercise 3 part 4
    // Prompt the user to enter a number then display the number entered by the user

    static void readNumber(String prompt){
        Scanner scanner = new Scanner(System.in);

        System.out.println(prompt);
        int number = scanner.nextInt();
        System.out.println("you enter the number " + number);

    }



}
