import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        double user_input  = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter number");
        double user_input2 = scan.nextDouble();
        scan.nextLine();
        System.out.println("The sum of numbers is");
        System.out.println(user_input + user_input2);



       /*Scanner scan2 = new Scanner (System.in);
       System.out.println("What is your name ?");
       String user_input3 = scan2.nextLine();
       System.out.print("Is your name ");
       System.out.println(user_input3);
       boolean user_input4 = scan2.nextBoolean();
       */









    }
}
