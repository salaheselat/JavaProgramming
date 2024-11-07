package loops;
import java.util.*;
public class exercise3se4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCost = 0;


            while (totalCost <133) {
                System.out.printf("enter product price");
                int price = scanner.nextInt();
                totalCost += price;

                if (totalCost >= 135) {
                    break;
                }
            }
        System.out.println("total is : " + totalCost + " you exceed budget");






    }
}
