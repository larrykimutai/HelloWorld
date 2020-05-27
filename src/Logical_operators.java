import java.util.Scanner;

public class Logical_operators {
    public static void main(String[] args) {

       /* int subject1 = 80;
        int subject2 = 90;
        // && -> "and" operator || -> "or" operator
        if ((subject1 >= 35) && (subject2 >= 35)) {
            System.out.println("the condition is true");
        }
        else {
            System.out.println("the condition is false");
        }
        */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter Test Score 1");
        double score1 = scan1.nextDouble();
        System.out.println("Enter Test Score 2");
        double score2 = scan1.nextDouble();
        System.out.println("Enter Test Score 3");
        double score3 = scan1.nextDouble();
        System.out.println("Enter Test Score 4");
        double score4 = scan1.nextDouble();
        double score_total = score1 + score2 + score3 + score4;
        double final_score = score_total / 4;

        if (final_score >= 97 && final_score >= 100) {
            System.out.println("Final Score: A+");
        } else {
            if (final_score >= 93 && final_score <= 96) {
                System.out.println("Final Score: A");
            } else {
                if (final_score >= 90 && final_score <= 92) {
                    System.out.println("Final Score: A-");
                } else {
                    if (final_score >= 87 && final_score <= 89) {
                        System.out.println("Final Score: B+");
                    } else {
                        if (final_score >= 83 && final_score <= 86) {
                            System.out.println("Final Score: B");
                        } else {
                            if (final_score >= 80 && final_score <= 82) {
                                System.out.println("Final Score: B-");
                            } else {
                                if (final_score >= 77 && final_score <= 79) {
                                    System.out.println("Final Score: C+");
                                } else {
                                    if (final_score >= 73 && final_score <= 76) {
                                        System.out.println("Final Score: C");
                                    } else {
                                        if (final_score >= 70 && final_score <= 72) {
                                            System.out.println("Final Score: C-");
                                        } else {
                                            if (final_score >= 67 && final_score <= 69) {
                                                System.out.println("Final Score: D+");
                                            } else {
                                                if (final_score >= 63 && final_score <= 66) {
                                                    System.out.println("Final Score: D");
                                                } else {
                                                    if (final_score >= 60 && final_score <= 62) {
                                                        System.out.println("Final Score: D-");
                                                    } else {
                                                        if (final_score >= 0 && final_score <= 59) {
                                                            System.out.println("Final Score: F");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
