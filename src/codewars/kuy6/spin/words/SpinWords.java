package spin.words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpinWords {
    public static String spinWords(String sentence) {
        List<String> reversedWords = new ArrayList<>();

        for (String s : sentence.split(" ")) {
            if (s.length() > 4) {
                reversedWords.add(new StringBuilder(s).reverse().toString());
            } else {
                reversedWords.add(s);
            }
        }
        return String.join(" ", reversedWords);
     }

    public static String spinWordsStream(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(word -> word.length() > 4 ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(spinWordsStream("Core Java is a term used by Sun Microsystems to refer to the Java to standard edition J2SE"));
    }
}
