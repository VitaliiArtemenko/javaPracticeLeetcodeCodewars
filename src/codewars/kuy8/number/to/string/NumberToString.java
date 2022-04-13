package number.to.string;

public class NumberToString {

    static String numberToString1(int num) {
        return num + "";
    }

    static String numberToString2(int num) {
        return Integer.toString(num);
    }

    static String numberToString3(int num) {
        return String.valueOf(num);
    }
}
