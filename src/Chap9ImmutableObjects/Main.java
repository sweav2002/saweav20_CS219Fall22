package Chap9ImmutableObjects;

public class Main {

    public static void main(String[] args) {

        String s = "hello";
        String t = new String("hello");

        // strings are immutable

        //make a version of s that is capitalized
        String s1 = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        System.out.println(s1);

        // StringBuilder - mutable strings

        // Character object is also immutable
        char ch = 'a';
        Character ch2 = 'a';
        Character ch3 = new Character('a');

        int x = 33;
        Integer y = 33;
        Integer y1 = new Integer(33);

        double pi = 3.14159;
        Double pi1 = 3.14159;
        Boolean flag = false;
        Long ll = 43L;
        pi1 = 2.7128;


        // Double, Long, Integer, Boolean, Character are all wrapper classes
        // for their respective primitive type
        // taking a primitive value and wrapping in an object is autoboxing
        // turning an object into its primitive is called autounboxing.

        Student student1 = new Student("Hermione", "Granger", "123",
                                        "The Smart One");
        Student student2 = new Student("Sarah", "Weaver", "14005462", "Weav");

        // student1.first = "Harry";  error
        //student1.nickname = "":  // remove Hermione's nickname

        System.out.println(student1); // toString is implicitly called
        System.out.println(student2);


    }

}
