package Methods;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        readDouble();

    }

    static void readInteger(){
        Scanner scanner = new Scanner(System.in);

        boolean read = true;
        int enteredNumber =0;

        System.out.printf("Enter a price as a whole number:\r\n");
        while (read) {
            try {
                enteredNumber = Integer.parseInt(scanner.nextLine());
                read = false;
            } catch (NumberFormatException e) {
                System.out.printf("Enter a whole number:\r\n");
            }
        }
    }

    static void readDouble(){
        Scanner scanner = new Scanner(System.in);
        boolean read = true;
        double enteredNumber = 0;

        System.out.printf("Enter number as a decimal\r\n");

        while (read) {
            try {
                enteredNumber =Double.parseDouble(scanner.nextLine());
                read = false;
            } catch (NumberFormatException e) {
                System.out.printf("Enter a valid double number \r\n");
            }
        }


    }
}
