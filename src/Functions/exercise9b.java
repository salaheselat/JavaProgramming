package Functions;

import java.util.Scanner;

public class exercise9b {
    public static void main(String[] args) {
        readNumber();

    }

    static void readNumber(){
        Scanner scanner = new Scanner(System.in);

        try {
            int num;
            while (true){
                System.out.println("Enter a number: ");
                num = scanner.nextInt();

                if (num >=20 && num <= 50) {
                    System.out.println("Great number entered is in range of 20-50");
                    break;
                } else {
                    System.out.println("Enter number between 2-50");
                }

            }
        }catch (NumberFormatException e) {
            System.out.println("Enter a valid number");
        }

    }
}
