import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] names = readNmae();

        System.out.println("you entred the following ");
        for ( String name : names) {
            System.out.println(name);

        }

    }

    static int addThreeNumbers(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        return result;
    }

    static int divide(int num1, int num2){
        int result= num1 / num2;
        if (num1 != 0) {
            return result;
        } if (num2 !=0) {
            return result;
        } else {
            System.out.println("Enter a positive number ");
        }
            return result;
    }


    static String[] readNmae(){
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];


        for (int i = 0; i <=4; i++){
            System.out.println("Enter 5 names "+ (i+1) + ": " );
            names[i] = scanner.nextLine();

        }
        return names;
    }
}







