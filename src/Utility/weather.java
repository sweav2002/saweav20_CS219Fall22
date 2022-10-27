package Utility;

import java.util.Scanner;
public class weather {

    public static double windchill(double t,    // temperature
                                   double v) {  // velocity
        return 35.74 + 0.6215*t + (0.4275*t - 35.75) *Math.pow(v, 0.16);
    }

    public static double getVelocity(Scanner s){
        boolean valid = false;
        double velocity = 0;

        while (!valid) {
            System.out.print("Enter wind velocity in degrees mph: ");

            if (s.hasNextDouble()) {
                velocity = s.nextDouble();
                if (velocity < 0) {
                    System.out.printf("Error: velocity cannot be negative. You entered %.2f\n", velocity);
                }
                else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a decimal number. You entered \"%s\"\n",
                        s.next());
            }
        } // while
        return velocity;
    }



    public static double getTemp(Scanner s) {
        boolean valid = false;
        double temperature = 0;

        while (!valid) {
            System.out.print("Enter temperature in degrees F: ");

            if (s.hasNextDouble()) {
                temperature = s.nextDouble();
                break;
            } else {
                System.out.printf("Error: please enter a decimal number. You entered \"%s\"\n",
                        s.next());
            }

        } // while
        return temperature;
    }


        public static void main (String[]args){

            // Used for getting input from the keyboard
            Scanner kbd = new Scanner(System.in);


            double velocity = getVelocity(kbd);
            double temperature = getTemp(kbd);


            // what is true at this point? x = 1
            System.out.printf("The windchill for %.1f degrees at %.1f mph is %.2f\n",
                    temperature, velocity, windchill(temperature, velocity));

        }
    }
