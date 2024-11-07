package loops;

import java.util.Scanner;

public class NuclearReactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get initial temperature and pressure
        System.out.print("Enter initial temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter initial pressure: ");
        double oldPressure = scanner.nextDouble();

        // Check if temperature exceeds limit
        while (temperature <= 1234) {
            System.out.print("Enter new pressure: ");
            double newPressure = scanner.nextDouble();

            // Calculate pressure change and temperature change
            double pressureChange = newPressure - oldPressure;
            double temperatureChange = pressureChange * 5;

            // Update temperature
            temperature += temperatureChange;

            // Print results
            System.out.println("Pressure change is " + pressureChange);
            System.out.println("Temperature change is " + temperatureChange);

            // Check for warning
            if (temperature > 1234) {
                System.out.println("Final warning: Temperature exceeds 1234°C!");
                break;
            }

            // Update old pressure
            oldPressure = newPressure;
        }

        // Close the scanner
        scanner.close();
    }
}

