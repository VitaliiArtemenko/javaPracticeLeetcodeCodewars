package capitalize;

public class Capitalize {

    public static String[] capitalize(String s) {
        String[] capitalized = {"", ""};

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                capitalized[0] += Character.toUpperCase(s.charAt(i));
                capitalized[1] += s.charAt(i);
            } else {
                capitalized[1] += Character.toUpperCase(s.charAt(i));
                capitalized[0] += s.charAt(i);
            }
        }
        return capitalized;
    }
}


