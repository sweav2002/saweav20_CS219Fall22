package Exam2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class Exam2Redo {
    public static String [] load_words(String path, int n) {
        // connect to the web page of speeds
        URL url = null;    // null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String [] words = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            String word = s.nextLine();
            if (isPalindrome2(word)){
                words[i++] = word;
            }
        }

        return words;

    }

    public static boolean isPalindrome2(String s) {
        if (s.length() < 2)
            return true;
        else if (s.charAt(0) == s.charAt(s.length() - 1) &&
                isPalindrome2(s.substring(1,s.length() - 1)))
            return true;
        else
            return false;

    }

    public static void reverse(String [] path) {

        for (int i = 0; i < path.length/2; i++) {
            String temp = path[i];
            path[i] = path[path.length - 1 - i];
            path[path.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                9);

        reverse(words);
        System.out.println(Arrays.toString(words));

    }

}
