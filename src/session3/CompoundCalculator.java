package session3;

import java.util.*;


public class CompoundCalculator {
    public static void main(String[] args) {
        double princial;
        double time;
        double interest;
        double total;



        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter principal amount");
        princial = userInput.nextDouble();

        System.out.print("Enter interest rate");
        interest = userInput.nextDouble() /100;

        System.out.print("Enter length of time in years");
        time = userInput.nextDouble();

        total = princial * Math.pow(1 + interest, time);
        interest = total - princial;


        System.out.printf("Total amount after %.2f years: %.2f%n", time, total);
        System.out.printf("Compound interest earned : %.2f", interest);

        userInput.close();



    }
}
