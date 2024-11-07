package loops;

public class RectangleArea {
    public static void main(String[] args) {
        int area = 960;
        System.out.println("Lengths and Widths for an area of 960:");

        // Loop through possible widths
        for (int width = 1; width <= area; width++) {
            // Calculate length
            int length = area / width;

            // Check if the length is a whole number (no remainder)
            if (area % width == 0) {
                System.out.println(width + " x " + length + " = " + area);
            }
        }
    }
}
