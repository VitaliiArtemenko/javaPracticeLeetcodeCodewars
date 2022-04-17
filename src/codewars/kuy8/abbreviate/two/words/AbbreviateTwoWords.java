package abbreviate.two.words;

public class AbbreviateTwoWords {
    public static String abbreviateTwoWords(String name) {
        return (name.split(" ")[0].charAt(0) + "." + name.split(" ")[1].charAt(0)).toUpperCase();
    }
}