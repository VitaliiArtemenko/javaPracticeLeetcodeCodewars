package reversed.strings;

public class ReversedStrings {

     public static String reversedStrings(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
