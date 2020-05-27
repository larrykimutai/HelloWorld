import java.util.Scanner;

public class Conditional_Statement {
    public static void main(String[] args){
        /*
        if (boolean_expression)
        {  execute if the boolean expression is true
            }
         */


      /*  int x = 10;  // == checks if x is really = 10

        if (x != 20) {
            System.out.println("Yes, x is equals to 10");      }
        else {
            System.out.println("No, x is not equal to 10");    }

            /*
            ==   is equal to
            !=   is not equal to
            >    is greater than
            <    is less than
            >=   is greater than or equal to
            <=   is less than or equal to
             */

      //Switch Statements
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter Score");
        int score = scan1.nextInt();


        //can be a byte, short, int, or char.
        switch(score){
            case 100:
            case 90:
                System.out.println("Very Good");
                break;
                //if you define a case without a break keyword, it executes the code that comes before the next break.
            case 85:
            case 80:
                System.out.println("Good");
                break;
            case 70:
                System.out.println("Fair");
                break;
            case 60:
                System.out.println("Poor");
                break;
                //if non of the conditions are met, use the key word default.
            default :
                System.out.println("The Grade does not fall within given parameters");
                break;

                //the switch statement evaluates the case and executes given code before the break key word.
        }

    }
}
