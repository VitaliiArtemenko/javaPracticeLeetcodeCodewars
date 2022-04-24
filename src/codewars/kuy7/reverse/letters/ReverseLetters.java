package reverse.letters;

public class ReverseLetters {

    public static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("[^A-Za-z]", "")).reverse().toString();
    }
}


