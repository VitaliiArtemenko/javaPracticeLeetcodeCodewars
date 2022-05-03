package reverse.number;

public class ReverseNumber {

    public static int reverse(int number) {
        StringBuilder num = new StringBuilder(String.valueOf(Math.abs(number)));
        num.reverse();
        return number > 0 ? Integer.parseInt(num.toString()) : -Integer.parseInt(num.toString());
    }
}
