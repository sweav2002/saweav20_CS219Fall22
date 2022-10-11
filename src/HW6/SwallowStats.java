package HW6;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class SwallowStats {

    public static void swallow_stats() {

        // connect to the wed page of speeds
        URL url = null;     // null is the "nothing value"
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path);  // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double sum = 0;
        int count = 0;
        double max = 0;
        double min = Double.POSITIVE_INFINITY;



        //what is true? we are able to connect to the website
        // read each line of the web file
        while(true) {

            if(!s.hasNextLine())
                break;

            String line = s.nextLine(); // read a line of the website
            if(line.indexOf("#") == -1 && !line.equals("")) {  // modify condition
                sum = sum + Double.parseDouble(line);
                count++;
                if (min > Double.parseDouble(line)){
                    min = Double.parseDouble(line);
                }
                if (max < Double.parseDouble(line)){
                    max = Double.parseDouble(line);
                }
            }
        }
        System.out.printf("The average swallow speed is %.2f\n", sum / count);
        System.out.printf("The minimum swallow speed is %.2f\n", min);
        System.out.printf("The maximum swallow speed is %.2f\n", max);

    }

    public static void main(String [] args) {
        swallow_stats();
    }

}
