import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int day =0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number for the day [1-7]");
        if (in.hasNextInt());
        day=in.nextInt();
        in.nextLine();

    switch(day){
        case 1:
            System.out.println("The day is Sunday");
            break;
        case 2:
            System.out.println("The day is Monday");
            break;
        case 3:
            System.out.println("The day is Tuesday");
            break;
        case 4:
            System.out.println("The day is Wednesday");
            break;
        case 5:
            System.out.println("The day is Thursday");
            break;
        case 6:
            System.out.println("The day is Friday");
            break;
        case 7:
            System.out.println("The day is Saturday");
            break;

        default:
            System.out.println("You have entered an invalid variable!");
            break;
       }
    }
}