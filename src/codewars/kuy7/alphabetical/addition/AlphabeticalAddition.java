package alphabetical.addition;

public class AlphabeticalAddition {
    public static String addLetters(String... letters) {
        if (letters.length == 0) {
            return "z";
        }

        int num = 0;

        for(String s : letters) {
            num += s.charAt(0) - 96;
        }
        return num % 26 == 0 ? "z" : String.valueOf((char)(num % 26 + 96));
    }
}