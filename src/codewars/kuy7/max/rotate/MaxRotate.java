package max.rotate;

import java.util.*;

public class MaxRotate {

    public static long maxRot (long n) {
        ArrayList<Long> rotated = new ArrayList<>();
        rotated.add(n);
        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++) {
            String temp = num.substring(0, i) + num.substring(i + 1) + num.charAt(i);
            rotated.add(Long.parseLong(temp));
            num = temp;
        }
        return Collections.max(rotated);
    }
}
