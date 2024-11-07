package session3;

import java.util.*;

public class Password {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int password = 123456;

        boolean passwordCorrect = false;
        do {
            System.out.println("Enter password");
            password = inn.nextInt();

            if (password == 123456) {
                System.out.println("password is correct");
                passwordCorrect = true;

            } else {
                System.out.println("password is wrong");
            }

        }while(!passwordCorrect);

    }

}
