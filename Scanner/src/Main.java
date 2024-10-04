import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = "";
        int age = 18;
        double salary = 0.0;

        System.out.println("What is your name: ");
        name = in.nextLine();
        System.out.println("Your name is: " + name);

        System.out.println("How old are you");
        if (in.hasNextInt()) {
        age = in.nextInt();
        in.nextLine();
        System.out.println("Your age is: " + age);
    }
        else{
            System.out.println("Your age is a number..");
            in.nextLine();
        }

        System.out.println("What is your salary");
        if (in.hasNextDouble()) {
            salary = in.nextDouble();
            in.nextLine();
        }
        else{
            System.out.println("Your salary should be a double");
            in.nextLine();
        }
        System.out.println("Your salary is: "+salary);
    }

}