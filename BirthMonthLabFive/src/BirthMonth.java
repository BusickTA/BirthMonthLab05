import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args) {
        int month =0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number for the month you were born [1-12]");
        if(in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine();

        }
        if (month==1) {
            System.out.println("Your birth month is January");
        }
        else if (month==2){
            System.out.println("Your birth month is February");
        }
        else if (month==3) {
            System.out.println("Your birth month is March");
        }
        else if (month==4) {
            System.out.println("Your birth month is April");
        }
        else if (month==5) {
            System.out.println("Your birth month is May");
        }
        else if (month==6) {
            System.out.println("Your birth month is June");
        }
        else if (month==7) {
            System.out.println("Your birth month is July");
        }
        else if (month==8) {
            System.out.println("Your birth month is August");
        }
        else if (month==9) {
            System.out.println("Your birth month is September");
        }
        else if (month==10) {
            System.out.println("Your birth month is October");
        }
        else if (month==11) {
            System.out.println("Your birth month is November");
        }
        else if (month==12) {
            System.out.println("Your birth month is December");
        }
        else{
            System.out.println("You have entered an invalid variable!");
        }
    }
}
