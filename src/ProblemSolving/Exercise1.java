package ProblemSolving;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        words();
        findWord();
        
    }
    
    static String [] words(){
        String[] words = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return words;
    }

    static void findWord(){
        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <= 7; i++){
            System.out.println("Enter 10 words "+ i);
            String words = scanner.nextLine();
        }
    }
}
