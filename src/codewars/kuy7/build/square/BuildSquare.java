package build.square;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BuildSquare {

    public static String generateShape(int n) {
        return IntStream.range(0, n).mapToObj(el -> "+".repeat(n)).collect(Collectors.joining("\n"));
    }
}