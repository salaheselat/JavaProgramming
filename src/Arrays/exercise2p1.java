package Arrays;

import java.util.Scanner;

public class exercise2p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Specify the number of plants
        System.out.print("Enter the number of plant types: ");
        int numOfPlants = scanner.nextInt();

        // Create an array to hold the number of plants for each type
        int[] numPlants = new int[numOfPlants];

        // Loop to get input from the user
        for (int i = 0; i < numOfPlants; i++) {
            System.out.print("Enter the number of plants for type " + (i + 1) + ": ");
            numPlants[i] = scanner.nextInt();
        }

        // Calculate the total number of plants
        int totalPlants = 0;
        for (int plants : numPlants) {
            totalPlants += plants;
        }

        // Display the total
        System.out.println("Total number of plants: " + totalPlants);

        }
    }

