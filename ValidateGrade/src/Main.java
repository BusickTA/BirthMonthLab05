import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       boolean done=false;
       int grade=0;
       int totalGrade=0;
       int numOfGrade=0;
       double average=0.0;
       do{
           System.out.println("Enter your grade[1-100] or -1 to quit");
           grade=in.nextInt();
           in.nextLine();
           if (grade == -1){
               done=true;
           }
           else {
               if (grade >= 0 && grade <= = 100){
                   //add grade to the current total grade
                   totalGrade += grade;
                   //increment number of grades by 1
                   numOfGrade++;
               }
           else{
                   System.out.println("Your Grade should be b/w 1-100");
               }
           }

       }while(!done);
       average= (double) totalGrade/numOfGrade;

    }
}