package loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int option;
            int results = 0;
            int number;
            do {
                System.out.println("Option 1 add");
                System.out.println("option 2 subtract");
                System.out.println("Option 3 Exit");
                option = in.nextInt();

                if (option == 1 || option == 2) {
                    System.out.println("Enter a number");
                    number = in.nextInt();

                    if (option ==1 ){
                        results += number;
                    } else if (number == 2) {
                        results -= number;

                    }

                }

            } while (option != 3);

            System.out.println("Your result is  finished " + results);

        }
}
