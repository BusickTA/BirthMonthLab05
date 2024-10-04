public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello World");
        //sout then hit enter is a quicker way to type out System.out.print
        int sum = 5 / 2;
        //int sum_d = 5.0 / 2;
        int sum_d2 = (int) 5.0 / 2;
        double sum_double = 5 / 2;
        double sum_double2 = 5.0 / 2;

        System.out.println("5/2 is " + sum);
        System.out.println("int 5.0/2 is " + sum_d2);
        System.out.println("double 5/2 is " + sum_double);
        System.out.println("double 5.0/2 is " + sum_double2);

        double sqrt = Math.sqrt(9);
        double pow = Math.pow(2, 3);
        System.out.println("9 squared is " + sqrt);
        System.out.println("2 to the power of 3 is " + pow);


    }
}

