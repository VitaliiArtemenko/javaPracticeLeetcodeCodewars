package jumping.number;

public class JumpingNumber {

    public static String jumpingNumber(int number) {
        String numbers = Integer.toString(number);
        for (int i = 0; i < numbers.length() - 1; i++) {
            if (Math.abs(numbers.charAt(i) - numbers.charAt(i + 1)) != 1) {
                return "Not!!";
            }
        }
        return "Jumping!!";
    }
}
