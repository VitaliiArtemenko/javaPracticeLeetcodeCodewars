package digits.explosion;

public class DigitsExplosion {

    public static String explode(String digits) {
        StringBuilder explodedNumbers = new StringBuilder();

        for (char c : digits.toCharArray()) {
            explodedNumbers.append(String.valueOf(c).repeat(+Integer.parseInt(String.valueOf(c))));
        }
        return explodedNumbers.toString();
    }
}