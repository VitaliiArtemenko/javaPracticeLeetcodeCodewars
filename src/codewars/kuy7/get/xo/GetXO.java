package get.xo;

public class GetXO {
    public static boolean getXO (String str) {
        return str.toLowerCase().replace("o", "").length() ==
                str.toLowerCase().replace("x", "").length();
    }
}
