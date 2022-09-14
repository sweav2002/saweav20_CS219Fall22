package HW3;

import HW3.Investment;

import java.util.Scanner;

public class InvestmentCalculator {

    public static void main(String [] args) {

        // prompt the user for c, r, t, n
        // and call the function with the inputted values

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter initial deposit as a decimal: ");
        double c;

        if (kbd.hasNextDouble()) {
            c = kbd.nextDouble();
            if (c < 0){
                System.out.printf("Error: initial deposit should be greater than zero. You entered \"%s\"",
                        c);
                return;
            }
        }
        else {
            System.out.printf("Error: please enter a decimal number. You entered \"%s\"",
                    kbd.next());
            return; // exit main
        }


        System.out.print("Enter interest rate as a decimal: ");
        double r;

        if (kbd.hasNextDouble()) {
            r = kbd.nextDouble();
            if (!(0 < r && r < 1)){
                System.out.printf("Error: interest rate should be expressed as a decimal between 0 and 1. You entered \"%s\"",
                        r);
                return;
            }
        }
        else {
            System.out.printf("Error: please enter a decimal number. You entered \"%s\"",
                    kbd.next());
            return; // exit main
        }


        System.out.print("Enter number of years as an integer: ");
        int t;

        if (kbd.hasNextInt()) {
            t = kbd.nextInt();
            if (t < 0) {
                System.out.printf("Error: number of years should be greater than zero. You entered \"%s\"",
                        t);
                return;
            }
        }
        else {
            System.out.printf("Error: please enter a integer. You entered \"%s\"",
                    kbd.next());
            return;
        }


        System.out.print("Enter number of times to compound per year as an integer: ");
        int n;

        if (kbd.hasNextInt()) {
            n = kbd.nextInt();
            if (n < 0) {
                System.out.printf("Error: number times to compound should be greater than zero. You entered \"%s\"",
                        n);
                return;
            }
        }
        else {
            System.out.printf("Error: please enter a integer. You entered \"%s\"",
                    kbd.next());
            return;
        }


        System.out.printf("💞 Your investment is worth %.2f", Investment.investment(c, r, t, n));
    }
}
