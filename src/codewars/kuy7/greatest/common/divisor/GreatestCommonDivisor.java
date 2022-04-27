package greatest.common.divisor;

public class GreatestCommonDivisor {

    public static int greatestCommonDivisor(int x, int y) {
        return x % y != 0 ? greatestCommonDivisor(y, x % y) : y;
    }
}
