import java.util.Scanner;

public class RPSAssignment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String player1;
        String player2;

        do {
            System.out.print("Enter player 1's choice (R, P, or S): ");
            player1 = in.nextLine();

        } while
            (!validinput(player1));
       //

        do {
            System.out.print("Enter player 2's choice (R, P, or S): ");
            player2 = in.nextLine();
        } while (!validinput(player2));
        //System.out.println("Enter R, P, or S.");

        Winner(player1, player2);
    }

  static boolean validinput(String choice) {
        return choice.equalsIgnoreCase("R") || choice.equalsIgnoreCase("P")
                || choice.equalsIgnoreCase("S");
    }

    private static void Winner(String player1, String player2) {
        if (player1.equalsIgnoreCase("R")) {
            if(player2.equalsIgnoreCase("R")){
            System.out.println("It is a tie");
         }else if (player1.equalsIgnoreCase("R")) {
            if (player2.equalsIgnoreCase("P")) {
                System.out.println("Player2 wins, paper covers rock!");
            } else {
                System.out.println("Player1 wins, rock beats scissors!");
            }

        } else if (player1.equalsIgnoreCase("P")) {
                if(player2.equalsIgnoreCase("P"))
                    System.out.println("It is a tie");
                }
            if (player2.equalsIgnoreCase("S")) {
                System.out.println("Player2 wins, scissors cut paper!");
            } else {
                System.out.println("Player1 wins, paper covers rock!");
            }

        } else if (player1.equalsIgnoreCase("S")) {
            if (player2.equalsIgnoreCase("S")) {
                System.out.println("It is a tie");
            }
            if (player2.equalsIgnoreCase("R")) {
                System.out.println("Player2 wins, rock beats scissors!");
            } else {
                System.out.println("Player1 wins, scissors cut paper!");
            }
        } else {
            System.out.println("Please choose R, P, or S.");
        }
    }
}

