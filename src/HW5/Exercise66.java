package HW5;

public class Exercise66 {


    public static boolean canSpell(String word, String tiles) {
        boolean canitspell = false;
        for (int i = 0; i < tiles.length(); i++){
            char tiles_letter = tiles.charAt(i);
            for(int j = 0; j < word.length(); j++){
                char word_letter = word.charAt(j);
                if (word_letter == tiles_letter){
                    word = word.substring(0, word.indexOf(word_letter)) +
                            word.substring(word.indexOf(word_letter) + 1);
                }
            }
        }
        if(word.length() == 0){
            canitspell = true;
        }
        return canitspell;
    }

    public static void main(String [] args) {
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("damn", "abcedmghijkn"));
        System.out.println(!canSpell("dummy", "abcdefghijkm"));

    }
}
