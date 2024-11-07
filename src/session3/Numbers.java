package session3;// session 3 exercise 5

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers;

        System.out.println("please enter a number");
        numbers = scanner.nextInt();

        if (numbers >= 10) {
            System.out.println("the number exceeds 10");
        } else if (numbers == 5) {
            System.out.println("the number entered matches 5");
        } else if (numbers <0) {
            System.out.println("the number is negative");
        } else {
            System.out.println("the number entered doesnt match 5, or less than 10");
        }

    }
}
