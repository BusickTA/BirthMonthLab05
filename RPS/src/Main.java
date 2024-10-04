import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

      String player1="";
      String player2="";
      Scanner in = new Scanner(System.in);

        System.out.println("Player 1 enter your choice [RPS]");
        player1=in.nextLine();
        System.out.println("Player 2 enter your choice [RPS]");
        player2=in.nextLine();

        if (player1.equals("R")){
            if (player2.equals("R")){
                System.out.println("It's a tie");
            }
            else if (player2.equals("S")){
                System.out.println("Player 1 wins");
            }
            else {
                System.out.println("PLayer 2 wins");
            }
        }
        if (player1.equals("S")){
            if (player2.equals("S")){
                System.out.println("It's a tie");
            }
            else if (player2.equals("P")){
                System.out.println("Player 1 wins");
            }
            else {
                System.out.println("PLayer 2 wins");
            }
        }
        if (player1.equals("P")){
            if (player2.equals("P")){
                System.out.println("It's a tie");
            }
            else if (player2.equals("R")){
                System.out.println("Player 1 wins");
            }
            else {
                System.out.println("PLayer 2 wins");
            }
        }

    }
}