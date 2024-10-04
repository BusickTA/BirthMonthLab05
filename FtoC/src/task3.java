import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 10;
        double height = 5;
        boolean done = false;

        do {
            System.out.println("Put the width of the rectangle:");
            if (in.hasNextInt()) {
                width = in.nextInt();
                in.nextLine();
            } else {
                System.out.println("Please enter a valid integer for width.");
                in.nextLine();
                continue;
            }

            System.out.println("Put the height of the rectangle:");
            if (in.hasNextInt()) {
                height = in.nextInt();
                in.nextLine();
            } else {
                System.out.println("Please enter a valid integer for height.");
                in.nextLine();
                continue;
            }

            if (width == 10 && height == 5) {
                System.out.println("You have entered the correct dimensions.");
                done = true;
            } else {
                System.out.println("You have not entered the correct dimensions. Try again.");
            }
        } while (!done);

        in.close();
    }
}