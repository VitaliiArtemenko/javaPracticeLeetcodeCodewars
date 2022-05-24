package sum.dig.power;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();

        for (long i = a; i <= b; i++) {
            String[] temp = String.valueOf(i).split("");
            long sum = 0;

            for (int j = 0; j < temp.length; j++) {
                sum += Math.pow(Integer.parseInt(temp[j]), j + 1);
            }
            if (sum == i) {
                result.add(sum);
            }
        }
        return result;
    }
}
