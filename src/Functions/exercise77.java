package Functions;

import java.util.Scanner;

public class exercise77 {
    public static void main(String[] args) {
        String[] names = readNames();

        System.out.println("You entered the following: ");
        for (String name : names) {
            System.out.println(name);
        }
    }

    static String[] readNames(){
        Scanner scanner = new Scanner(System.in);

        String [] names = new String[5];

        for (int i = 0; i <= 4; i++){
            System.out.print("Enter a name " + (i + 1) + ": ");
            names [i] = scanner.nextLine();
        }
        return names;

    }
}
