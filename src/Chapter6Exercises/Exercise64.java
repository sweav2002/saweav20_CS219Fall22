package Chapter6Exercises;

public class Exercise64 {


    public static String toLower(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                r = r + (char) ('a' + ch - 'A');
            }
            else {
                r = r + ch;
            }
        }
        return r;
    }


    public static boolean isAbecedarian(String s){
        s = s.toLowerCase();

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) >= s.charAt(i+1)) {
                return false;
            }
        } // for
        // what is true if we made it to the point?
        return true;
    }

    public static boolean isAlphabetical(String s){
        // Rewrite using a while loop
        int i = 0;
        while (i < s.length() - 1) {
            if (s.charAt(i) >= s.charAt(i+1)) {
                return false;
            }
            i++;
        } // while
        // what is true if we made it to the point?
        return true;
    }













    public static void main(String [] args){


        System.out.println(toLower("APPLE"));
        System.out.println(toLower("ApPLE"));
        System.out.println(toLower("ApPLE"));
        System.out.println(toLower("ApPLE!#@$"));

        System.out.println(isAbecedarian("biOPsy"));
        System.out.println(!isAbecedarian("apple"));

        System.out.println(isAlphabetical("biopsy"));
        System.out.println(!isAlphabetical("apple"));

    }

}
