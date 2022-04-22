package counting.sheep;

public class CountingSheep {

    public static String countingSheep(int num) {
        StringBuilder counted = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            counted.append(i).append(" sheep...");
        }
        return counted.toString();
    }
}
