package is.square;

public class IsSquare {
    public static boolean isSquare(int n) {
       return Math.sqrt(n) % 1 == 0;
    }
}
