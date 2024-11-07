package loops;

public class Exercise2Ses4 {
    public static void main(String[] args) {
        double price = 28;
        for (int discount = 5; discount <=11; discount++){
            double savings = (discount / 100.0) * price;
            System.out.printf("%d%% discount: £%.2f%n", discount, savings);

        }
    }
}
