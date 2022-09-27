package Exam1;

import java.util.Scanner;

public class Exam1 {

    public static int getN(Scanner N){
        boolean valid = false;
        int n = 0;

        while (!valid) {
            System.out.print("Enter an integer: ");

            if (N.hasNextInt()) {
                n = N.nextInt();
                if (n < 0) {
                    System.out.printf("Error: please enter an integer greater than zero. You entered \"%s\"\n",
                            n);

                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter an integer. You entered \"%s\"\n",
                        N.next());

            }
        }
        return n;
    }

   public static int exclusive27(int n){
       int cnt = 0;
       while (n > 0){
           if (n % 10 > 2 && n % 10 < 7){

               cnt++;
           }
           n = n / 10;
       }
       return cnt;
   }

    public static void main(String [] args){
        Scanner kbd = new Scanner(System.in);
        int n = getN(kbd);

        System.out.println(exclusive27(n));

    }
}
