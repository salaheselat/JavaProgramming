package Arrays;

import java.util.Scanner;

public class excercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] values = new int[2];

        for (int i = 0; i < values.length; i++) {
            System.out.println("Enter a value" + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }


        //Swap values
        int temp = values[0];
        values[0] = values[1];
        values[1] = temp;

        System.out.println("Displaying contents after swapping");
        for (int i = 0; i < values.length; i++) {
            System.out.println("value " + (i + 1) + ": " + values[i]);
        }
    }
}
