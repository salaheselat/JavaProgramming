package session3;
import java.util.Scanner;
import java.lang.String.*;
public class books {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String title;
        String category;
        String publisher;


        System.out.println("enter title");
        title = scanner.nextLine();

        System.out.println("enter category");
        category = scanner.nextLine();

        System.out.println("enter publisher");
        publisher = scanner.nextLine();

        if (category.equalsIgnoreCase("fiction")) {
            System.out.println("We don't sell this type of books");
        } else if (publisher.equalsIgnoreCase("O'Riely"))  {
            System.out.println("We don't sell books by these publishers");
        } else if (publisher.equalsIgnoreCase("Quercus")) {
            System.out.println("We don't sell books by these publishers");
        } else {
            System.out.println("book available");
        }
    }
}
