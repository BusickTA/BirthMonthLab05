import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double c;
        double f;

        do {
            System.out.print("Enter the temperature in Celsius (°C): ");
            if (in.hasNextDouble()) {
                c = in.nextDouble();
                break;
            } else {
                System.out.println("Please enter a number value.");
                in.nextLine();
            }
        } while (true);


        f = (c * 1.8) + 32;


        // Test known freezing and boiling points
        if (c == 0) {
            System.out.println("Freezing point of water (0C or 32F)");
        }
        if (c == 100) {
            System.out.println("Boiling point of water (100C or 212F)");
        }

        in.close();
    }
}