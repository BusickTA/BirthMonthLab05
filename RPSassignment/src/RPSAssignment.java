import java.util.Scanner;

public class RPSAssignment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String player1;
        String player2;
        String replay;

        do {
            do {
                System.out.print("Enter player 1's choice (R, P, or S): ");
                player1 = in.nextLine();
            } while (!validinput(player1));

            do {
                System.out.print("Enter player 2's choice (R, P, or S): ");
                player2 = in.nextLine();
            } while (!validinput(player2));

            Winner(player1, player2);

            System.out.print("Replay? (Y/N): ");
            replay = in.nextLine();
        } while (replay.equalsIgnoreCase("Y"));

        System.out.println("Thank you for playing!");
    }

    static boolean validinput(String choice) {
        return choice.equalsIgnoreCase("R") || choice.equalsIgnoreCase("P")
                || choice.equalsIgnoreCase("S");
    }

    private static void Winner(String player1, String player2) {
        if (player1.equalsIgnoreCase("R")) {
            if (player2.equalsIgnoreCase("R")) {
                System.out.println("It is a tie.");
            } else if (player2.equalsIgnoreCase("P")) {
                System.out.println("Player 2 wins, paper covers rock!");
            } else {
                System.out.println("Player 1 wins, rock beats scissors!");
            }
        } else if (player1.equalsIgnoreCase("P")) {
            if (player2.equalsIgnoreCase("P")) {
                System.out.println("It is a tie.");
            } else if (player2.equalsIgnoreCase("S")) {
                System.out.println("Player 2 wins, scissors cut paper!");
            } else {
                System.out.println("Player 1 wins, paper covers rock!");
            }
        } else if (player1.equalsIgnoreCase("S")) {
            if (player2.equalsIgnoreCase("S")) {
                System.out.println("It is a tie.");
            } else if (player2.equalsIgnoreCase("R")) {
                System.out.println("Player 2 wins, rock beats scissors!");
            } else {
                System.out.println("Player 1 wins, scissors cut paper!");
            }
        }
    }

}
