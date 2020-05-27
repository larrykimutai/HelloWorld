import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number");
        int user_input_number = scan.nextInt();
        System.out.println("The entered number is");
        System.out.println(user_input_number);
        //nextInt - you are expecting an integer, but what if you want a text or double value.

        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter decimal");
        double user_input_double = scan.nextDouble();
        System.out.println("The enterd decimal is");
        System.out.println(user_input_double);

        Scanner scan2 = new Scanner (System.in);
        System.out.println("Enter true or false");
        boolean user_input_boolean = scan.nextBoolean();
        System.out.println("The entered number is");
        System.out.println(user_input_boolean);



        Scanner scan3 = new Scanner (System.in);
        System.out.println("Enter number");
        double user_input_doubl = scan.nextDouble();
        System.out.println();


        Scanner scan4 = new Scanner (System.in);
        //Scanner is a special class/data type in Java
        //then you use scan4 for example to define the Scanner
        //which is equal to, new Scanner and takes an input --- {(System.in)}

        // Scanner scan = new Scanner (System.in); this line of code enables use to take input from the user

        //System.out.println("Example") show what input user
        //then define a variable -- {int x = scan.nextInt();} scan is the object from first line.
        //Then print the entered value {System.out.println("The entered number is");}



    }
}
