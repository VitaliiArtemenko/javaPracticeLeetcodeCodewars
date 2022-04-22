package square.digits;

public class SquareDigits {

    public static int squareDigits(int n) {
        StringBuilder result = new StringBuilder();
        String[] numbers = String.valueOf(n).split("");
        for (String number : numbers) {
            result.append((int) Math.pow(Double.parseDouble(number), 2));
        }
        return Integer.parseInt(result.toString());
    }
}
