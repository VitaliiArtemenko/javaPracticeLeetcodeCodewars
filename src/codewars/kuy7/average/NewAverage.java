package average;

import java.util.Arrays;

public class NewAverage {

    public static int newAvg(double[] arr, double navg) {
        if (Arrays.stream(arr).average().orElse(Double.NaN) > navg) {
            throw new IllegalArgumentException(String.format("%f must be greater", navg));
        }
        return (int) Math.ceil(navg * (arr.length + 1) - Arrays.stream(arr).sum());
    }
}

