import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args){

        int number = 0; //computer -> output
        int guess = 0; //user -> input

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        number = rand.nextInt( 1,11 ); //includes one but excludes 11, makes it 1-10
        System.out.println("Enter a number 1 from 10: ");
        //dyi: make sure input is a number
        guess =in.nextInt();
        if (guess > number){
            System.out.println("Your guess is too high");
        }
        else if (guess < number){
            System.out.println("Your guess is too small");
        }
        else{
            System.out.println("Your guess is correct");
        }
        System.out.println("The generated number is " + number);
    }
}