import Utility.Investment;

import java.util.Scanner;

public class InvestmentCalculator {

    public static void main(String [] args) {

        // prompt the user for c, r, t, n
        // and call the function with the inputted values

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter initial deposit as a decimal: ");
        double c = kbd.nextDouble();

        System.out.print("Enter interest rate as a decimal: ");
        double r = kbd.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int t = kbd.nextInt();

        System.out.print("Enter number of times to compound per year as an integer: ");
        int n = kbd.nextInt();

        System.out.printf("Your investment is worth %.2f", Investment.investment(c, r, t, n));
    }
}
