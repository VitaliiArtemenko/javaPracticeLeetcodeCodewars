package carboat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Carboat {

    public static String howMuch1(int m, int n) {
       StringBuilder sb = new StringBuilder();
       List<Integer> sevens = new ArrayList<>();
       List<Integer> result = new ArrayList<>();

       if (m > n) {
           int temp = m;
           m = n;
           n = temp;
       }

        for (int i = m; i <= n; i++) {
            for ( int j = 1; j < n; j++) {
                if (i - 7 * j == 2) {
                    sevens.add(i);
                }
            }
        }

        for (Integer num : sevens) {
            for (int i = 1; i < n; i++) {
                if (num - 9 * i == 1) {
                    result.add(num);
                }
            }
        }

        for (Integer num : result) {
            sb.append(String.format("[M: %d B: %d C: %d]", num, (num - 2) / 7, (num - 1) / 9 ));
        }

        return "[" + sb + "]";
    }

    public static String howMuch2(int m, int n) {
        return "[" + IntStream.rangeClosed(Math.min(m, n), Math.max(m, n))
                .filter(el -> el % 9 == 1 && el % 7 == 2)
                .mapToObj(el -> String.format("[M: %d B: %d C: %d]", el, el / 7, el / 9))
                .collect(Collectors.joining()) + "]";
    }

    public static void main(String[] args) {
        System.out.println(howMuch2(10000, 9950));
    }
}
