package number.to.string;

public class NumberToString {

    public static String numberToString1(int num) {
        return num + "";
    }

    public static String numberToString2(int num) {
        return Integer.toString(num);
    }

    public static String numberToString3(int num) {
        return String.valueOf(num);
    }
}
