package triple.trouble;

public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder concatenatedString = new StringBuilder();

        for (int i = 0; i < one.length(); i++) {
            concatenatedString.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return concatenatedString.toString();
    }
}
