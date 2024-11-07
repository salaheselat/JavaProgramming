package Functions;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
//        int number;
//        System.out.print("Enter number");
//        number = readNumber();
//        addNumbers(10,120);

        /////////////////////////////////////////
//        calculateAreaOfSquare(10,15);
//        double base = 10;
//        double height = 10;
//        double area =calculateAreaOfSquare(base, height);
//        System.out.println(area);

    }

    static int readNumber(){
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    static int addNumbers(int num1, int num2){
        return num1 + num2;
    }

    static double calculateAreaOfSquare(double base, double height){
        double area = base * height;
        return area;
    }

}
