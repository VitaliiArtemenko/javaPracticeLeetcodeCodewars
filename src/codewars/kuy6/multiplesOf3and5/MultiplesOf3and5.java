package multiplesOf3and5;

import java.util.stream.IntStream;

public class MultiplesOf3and5 {

    public static int multiplesOf3and5(int number) {
        int sum = 0;
        for (int i = 3; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int multiplesOf3and5Stream(int number) {
        return IntStream.range(3, number).filter(el -> el % 3 == 0 || el % 5 == 0).sum();
    }
}
