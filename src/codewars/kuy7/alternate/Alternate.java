package alternate;

public class Alternate {

    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] result = new String[n];

        for(int i = 0; i < n; i++) {
            result[i] = i % 2 == 0 ? firstValue : secondValue;
        }
        return result;
    }
}
