package maximum.length.difference;

public class MaximumLengthDifference {

    public static int maximumLengthDifference(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }

        int maxDiff = 0;

        for (String s : a1) {
            for (String value : a2) {
                if (maxDiff < Math.abs(s.length() - value.length())) {
                    maxDiff = Math.abs(s.length() - value.length());
                }
            }
        }
        return maxDiff;
    }
}
