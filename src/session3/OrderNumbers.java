// session 3 exercise 6
// revisit does not work as intended///////////////

package session3;

import java.util.*;
public class OrderNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one;
        int two;
        int three;
        int four;
        int small = 0;
        int large = 0;

        System.out.println("enter number");
        one = scanner.nextInt();

        System.out.println("enter number");
        two = scanner.nextInt();

        System.out.println("enter number");
        three = scanner.nextInt();

        System.out.println("enter number");
        four = scanner.nextInt();


        if (two < small) small = two;
        if (three<small) small = three;
        if (four < small) small = four;

        if (two > large) large = two;
        if (three > large) large =three;
        if (four > large) large = four;

        System.out.println(large);
        System.out.println(small);
    }
}
