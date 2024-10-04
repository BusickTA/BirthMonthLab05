import java.util.Random;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int guess = 0;
        boolean done = false;
        int oneToTen = rand.nextInt(10) + 1;

        System.out.println("Guess a number between 1 and 10:");
        if (in.hasNextInt()) {
            guess = in.nextInt();
            in.nextLine();
        }

        do {
            if (guess > oneToTen) {
                System.out.println("Your guess was too high.");}
            else if (guess < oneToTen) {
                System.out.println("Your guess was too low.");}
            else {
                System.out.println("Your guess was correct!");
                done = true;}

            if (guess < 1 || guess > 10) {
                System.out.println("Please enter a number between 1 and 10.");
            } else {
                break;
            }
            System.out.print("Retry");
            guess = in.nextInt();
            in.nextLine();
        } while (!done);

        in.close();
    }
}