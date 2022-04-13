package reversed.strings;

public class ReversedStrings {
    static String reversedStrings(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
