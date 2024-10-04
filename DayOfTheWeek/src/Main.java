import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         int day=0;
         Scanner in = new Scanner(System.in);
        System.out.println("Enter a number for the day [1-7]");
             if(in.hasNextInt()) {
                 day = in.nextInt();
                 in.nextLine(); //clears the buffer

         }
         if (day==1) {
             System.out.println("The day is Sunday");
         }
         else if (day==2){
             System.out.println("The day is Monday");
         }
         else if (day==3) {
             System.out.println("The day is Tuesday");
         }
         else if (day==4) {
             System.out.println("The day is Wednesday");
         }
         else if (day==5) {
             System.out.println("The day is Thursday");
         }
         else if (day==6) {
             System.out.println("The day is Friday");
         }
         else if (day==7) {
             System.out.println("The day is Saturday");
         }
         else{
             System.out.println("You have entered an invalid variable!");
         }
    }
}