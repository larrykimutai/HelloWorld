public class Math {
    public static void main(String[] args) {
      /*
        //Math and Arithmetic
        int x, y, answer;
        x = 20;
        y = 30;
        answer = x + y;

        System.out.println("Answer = " + answer);
        // the + is called a concatenations operator
        // +, -, *, /, %
        // when dividing make sure it not an int
        // the %, modulus operator, returns the remainder of the division
        */

      //Increment Operator
      int x = 10 ;
      x = x + 1;  //this will increment x by one
      System.out.println(x);


      int y = 10;
      y++;  //this is another way of incrementing the value by one.
      System.out.println(y);

      //pre and post implementation
        int v = 10;
        System.out.println(v++); //v will have the value of 10 on this line, but on the next line, v = 11
        System.out.println(++v); //v = 11 on this line

        v *= 5; // v = v * 5


    }
}
