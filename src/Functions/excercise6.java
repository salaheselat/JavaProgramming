package Functions;

import java.util.Scanner;

public class excercise6 {
    public static void main(String[] args) {

       int snigle = readSingleDigitNumbers();
        System.out.println("Great you entered a single digit number: " + snigle);

    }

    static int readSingleDigitNumbers(){
        int number;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter single digit number");
            number = scanner.nextInt();

            if (number >=0 && number<10){
                return number;
            } else {
                System.out.println("Number given is bigger than 10 or negative ");
            }

        }
    }
}
