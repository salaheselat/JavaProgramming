package loops;
import java.util.*;
public class exercise3p2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String exit = "";

        while (true) {
            System.out.println("Enter a number 1 ");
            int num1 = scanner.nextInt();

            System.out.println("Enter number 2 ");
            int num2 = scanner.nextInt();

            int results = num1 + num2;
            System.out.println("result " +results);

            scanner.nextLine();

            System.out.println("exit? yes or no??");
            exit = scanner.nextLine();
            if (exit.equalsIgnoreCase("yes")){
                break;
            }
        }
        System.out.println("Thank you");
    }
}
