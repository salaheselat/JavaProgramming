package loops;

import java.util.Random;
import java.util.Scanner;

public class MathQuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int lives = 3;

        System.out.println("Welcome to the Math Quiz Game!");
        System.out.println("You have " + lives + " lives. Each correct answer gives you 1 point.");

        while (lives > 0) {
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            char operator = random.nextBoolean() ? '+' : '-';

            int correctAnswer;
            if (operator == '+') {
                correctAnswer = num1 + num2;
            } else {
                correctAnswer = num1 - num2;
            }

            System.out.print(num1 + " " + operator + " " + num2 + " = ? ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                score++;
                System.out.println("Correct! Your score: " + score);
            } else {
                lives--;
                System.out.println("Wrong answer. Lives remaining: " + lives);
            }
        }

        // Game over, display final score
        System.out.println("Game over! Your final score is: " + score);
        scanner.close();
    }
}
