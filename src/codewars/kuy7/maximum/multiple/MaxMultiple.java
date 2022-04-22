package maximum.multiple;

public class MaxMultiple {

    public static int maxMultiple(int divisor, int bound) {
        int maxMultiple = 0;

        for (int i = bound; i > 0; i--) {
            if (i % divisor == 0) {
                maxMultiple = i;
                break;
            }
        }
        return maxMultiple;
    }
}
