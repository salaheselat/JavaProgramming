package session3;

import java.util.*;

public class Speed {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int speed;

        System.out.println("enter your speed at motorway");
        speed = Integer.parseInt(inn.nextLine());

        if (speed >= 71){
            System.out.println("you went over the speed limit");
        } else if (speed <= 70) {
            System.out.println("you driving under the speed limit");

        }
    }
}
