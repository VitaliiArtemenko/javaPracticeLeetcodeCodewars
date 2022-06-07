package mixed.sum;
import java.util.List;

public class MixedSum {
    public static int sum(List<?> mixed) {
        return mixed.stream().mapToInt(el -> Integer.parseInt(String.valueOf(el))).sum();
    }
}