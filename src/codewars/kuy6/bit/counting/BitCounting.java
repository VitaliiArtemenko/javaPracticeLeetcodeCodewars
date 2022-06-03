package bit.counting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BitCounting {
    public static int countBits(int n){
        return Arrays.stream(Integer.toBinaryString(n).split(""))
                .filter(el -> !el.equals("0"))
                .collect(Collectors.joining("")).length();
    }
}
