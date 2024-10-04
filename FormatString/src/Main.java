public class Main {
    public static void main(String[] args) {
        String name1="The good tom";
        String name2="Welcome to the University of Cincinnati";

        String email1= "some@thing.com";
        String email2="@me.com";

        int age1=1;
        int age2=65;

        double cost1= 123.678;
        double cost2= 23.50;

        System.out.println("Hello to %25s\n", name1);
        System.out.println("Hello to %-25s\n", name1); //has a dash
        System.out.println("Hello to %25s\n", name2);
    }
}