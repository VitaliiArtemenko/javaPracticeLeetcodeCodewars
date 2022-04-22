package disemvowel.trolls;

public class DisemvowelTrolls {

    public static String disemvowelTrolls(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }
}
