package sort.my.textbooks;

import java.util.Collections;
import java.util.List;

public class SortMyTextbooks {

    static List<String> sortMyTextbooks(List<String> textbooks) {
        textbooks.sort(String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }
}
