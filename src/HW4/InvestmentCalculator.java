package HW4;

import java.util.Scanner;
public class InvestmentCalculator {


    public static double getC(Scanner C) {
        boolean valid = false;
        double c = 0;

        while (!valid) {
            System.out.print("Enter initial deposit as a decimal: ");

            if (C.hasNextDouble()) {
                c = C.nextDouble();
                if (c < 0) {
                    System.out.printf("Error: initial deposit should be greater than zero. You entered \"%s\"\n", c);

                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a decimal number. You entered \"%s\"\n",
                        C.next());

            }
        }
        return c;
    }

    public static double getR(Scanner R) {
        boolean valid = false;
        double r = 0;

        while (!valid) {
            System.out.print("Enter interest rate as a decimal: ");
            if (R.hasNextDouble()) {
                r = R.nextDouble();
                if (!(0 < r && r < 1)) {
                    System.out.printf("Error: interest rate should be expressed as a decimal between 0 and 1. You entered \"%s\"\n",
                            r);

                }
                else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a decimal number. You entered \"%s\"\n",
                        R.next());

            }
        }
        return r;
    }

    public static int getT(Scanner T) {
        boolean valid = false;
        int t = 0;

        while (!valid) {
            System.out.print("Enter number of years as an integer: ");

            if (T.hasNextInt()) {
                t = T.nextInt();
                if (t < 0) {
                    System.out.printf("Error: number of years should be greater than zero. You entered \"%s\"\n", t);

                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter an integer. You entered \"%s\"\n",
                        T.next());

            }
        }
        return t;
    }


    public static int getN(Scanner N) {
        boolean valid = false;
        int n = 0;

        while (!valid) {
            System.out.print("Enter number of times to compound per year as an integer: ");

            if (N.hasNextInt()) {
                n = N.nextInt();
                if (n < 0) {
                    System.out.printf("Error: number times to compound should be greater than zero. You entered \"%s\"\n",
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

    public static void main(String [] args) {

        Scanner kbd = new Scanner(System.in);
        double c = getC(kbd);
        double r = getR(kbd);
        int t = getT(kbd);
        int n = getN(kbd);

        System.out.printf("💞 Your investment is worth %.2f", Investment.investment(c, r, t, n));
    }
}
