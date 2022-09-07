package HW2;

/*
*  Sarah Weaver
*  9/6/22
*  HW 2
 */

import java.util.Scanner;

public class DayOfWeek {

    public static double dayofweek(int m, int d, int y){

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;

        return d0;
    }

    public static void main(String [] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = kbd.nextInt();

        System.out.print("Enter day: ");
        int day = kbd.nextInt();

        System.out.print("Enter year: ");
        int year = kbd.nextInt();

        System.out.println((int)dayofweek(month, day, year));
    }

}


