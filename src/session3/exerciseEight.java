package session3;
import java.util.*;

public class exerciseEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStudentIn =0;
        int numOfStudentOut =0;
        int remaining = numOfStudentIn - numOfStudentOut;
        String alarm;


        System.out.println("enter number of student in");
        numOfStudentIn = scanner.nextInt();

        System.out.println("enter number of student left the building");
        numOfStudentOut = scanner.nextInt();

        System.out.println("should the alarm be armed");
        alarm= scanner.next();

        if (remaining >0) {
            if(alarm.equalsIgnoreCase("yes"))
            System.out.println("people left in the building " + remaining);

        } else {
            System.out.println("building is empty");
        }


    }
}
