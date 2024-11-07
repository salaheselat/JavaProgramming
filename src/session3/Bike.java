package session3;// session 3 exercise 4

import java.util.Scanner;

public class Bike {
    public static void main(String[] args) {
        Scanner bikee = new Scanner(System.in);
        int bikePrice;

        System.out.println("enter price of a bike");
        bikePrice = Integer.parseInt(bikee.nextLine());


        if (bikePrice >= 500) {
            System.out.println("this bike is too expensive");
        } else if (bikePrice < 500) {
            System.out.println("you can afford this bike");

        }
    }
}
