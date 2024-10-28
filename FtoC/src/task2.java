import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double tankGallons = 0;
        double mpg = 0;
        double gasPrice = 0;
        double costFor100Miles = 0;
        double maximumDistance = 0;

        do{
            System.out.println("Enter your gas tanks capacity");
            tankGallons = in.nextDouble();
        } while (tankGallons <0);
        do{
            System.out.println("what is your mpg");
            mpg = in.nextDouble();
        } while (mpg <0);
        do{
            System.out.println("What is the price per gallon");
            gasPrice = in.nextDouble();
        } while (gasPrice <0);
          costFor100Miles = (100/mpg) * gasPrice;
        System.out.println("Your cost to drive 100 miles is " + costFor100Miles);
        maximumDistance = (tankGallons * mpg);
        System.out.println("Your max distance you can go is " + maximumDistance);

        in.close();
    }

}
