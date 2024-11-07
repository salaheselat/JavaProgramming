package Functions;

public class exercise88 {
    public static void main(String[] args) {
        // Part one
//        System.out.println(addThreeNumbers(1,2,3));



        // Part 2
//        try {
//            double result = divideTwoNumbers(10, 2);  // Returns 5.0
//            System.out.println(result);
//            double resultZero = divideTwoNumbers(10, 0);  // Returns 0
//            System.out.println(resultZero);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }




        // Part 3
//        double price = 20.0;
//        double discount = 5.2;
//        double discountedPrice = calculateDiscountPrice(price, discount); // Returns £18.96
//        System.out.printf("Discounted Price: £%.2f%n", discountedPrice);




        // Part 4
//        System.out.println(areEqual(2,2)); // this equals true
//        System.out.println(areEqual(1,2)); // this equals false



        // Part 5
//        System.out.println(isInRange(5.5));  // true
//        System.out.println(isInRange(3));    // true
//        System.out.println(isInRange(68));   // true
//        System.out.println(isInRange(2.9));  // false
//        System.out.println(isInRange(70));   // false



        // Part 6
//        int[] array = {1, 2, 3, 4, 5};
//        System.out.println(checkNumbers(array, array.length, 3)); // true
//        System.out.println(checkNumbers(array, array.length, 6)); // false


    }










    // Part one
    static int addThreeNumbers(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        return sum;
    }



    // Part 2
    static double divideTwoNumbers(double num1, double num2){
        double divide = num1 / num2;

            if (num1 < 0 || num2 < 0) {
                throw new IllegalArgumentException("Both numbers must be positive.");
            }
            if (num2 == 0) {
                return 0;
            }
            return num1 / num2;
        }


    // Part 3

    static double calculateDiscountPrice(double price, double percentage) {
        double discount = percentage / 100 * price;
        double results = price - discount;
        return results;
    }




    // part 4
    static boolean areEqual (int num1, int num2){
        if (num1 == num2 || num2 == num1){
            return true;
        } else {
            return false;
        }

    }



    // Part 5
    static boolean isInRange(double number){
        return number >= 3 && number <= 68;
    }



    // Part 6
    static boolean checkNumbers(int[] numbers, int length, int match) {
        // Iterate through the array to check for the match value
        for (int i = 0; i < length; i++) {
            if (numbers[i] == match) {
                return true; // Return true if a match is found
            }
        }
        return false; // Return false if no match is found
    }




}

