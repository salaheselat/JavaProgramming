package Arrays;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result;
        double multiplier;
        double[] values = {0.234, 0.999, 1.999, 28.899, -0.8372};

        System.out.println("Enter a multiplier");
        multiplier = scanner.nextDouble();

        System.out.println("Results after multiplication:");
        for (double value : values) {
            result = value * multiplier;
            System.out.printf("%.4f * %.2f = %.4f%n", value, multiplier, result);
        }
    }
}
