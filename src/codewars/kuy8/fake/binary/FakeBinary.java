package fake.binary;

import java.util.stream.Collectors;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.chars().mapToObj(el -> el < '5' ? "0" : "1").collect(Collectors.joining());
    }


    public static void main(String[] args) {
        System.out.println(fakeBin("6107049196"));
    }
}
