// discount not working revisit

package session3;
import java.util.Scanner;
public class exerciseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price =0;
        int quantity =0;
        double total =0;
        double discount = 0.1 * total;


        System.out.println("Enter price");
        price = scanner.nextDouble();

        System.out.println("enter quantity");
        quantity = scanner.nextInt();

        if (price >= 200 && quantity >= 10) {
            discount = 0.1 * total;
            total = price * quantity - discount;
            System.out.println("discount applied" + discount);
        } else {
            System.out.println("no discount applied");
        }

        System.out.printf("Total price: %.2f%n", total + discount);

    }
}
