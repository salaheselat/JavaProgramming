package loops;
import java.util.*;
public class AddingNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;
        int results;

        for (int i = 1; i <= 3; i++) {
            System.out.println("please enter a number 1 ");
            number1 = scanner.nextInt();
            System.out.println("please enter a number 2 ");
            number2 = scanner.nextInt();

            results = number1 + number2;
            System.out.println("the result " + results);
        }
    }
}
