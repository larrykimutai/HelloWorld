import java.util.Scanner;

public class Test {
    public static void main (String[] args){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter First Score");
        double score1 = scan1.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter Second Score");
        double score2 = scan2.nextDouble();

        double x = score1 + score2;
        double fscore = x / 2;

    if (fscore >= 80) {
        System.out.println("Congratulations, you passed !!");
        }
        else { System.out.println("You Failed, try again"); }
    }
}
