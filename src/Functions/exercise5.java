package Functions;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        /*
         *          Part one           */
//        String name = getname();
//        System.out.println("Hello " + name);

//        readPrice();

//    readMessage();
    }


    //Part one
    static String getname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        return name;
    }

// Part 2

    static double readPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price");
        double price = scanner.nextDouble();
        if (price < 0) {
            return 0; // Return zero if the price is negative
        } else {
            return price; // Return the valid price
        }
//        if (price > 0) {
//            System.out.println("correct");
//        } else {
//            System.out.println("negative number");
//        }
//        return price;
    }


    static String readMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter message");
        String message = scanner.nextLine();
        return name + message;
    }

}