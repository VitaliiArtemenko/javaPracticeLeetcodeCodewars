package list.filtering;

import java.util.List;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(el -> el instanceof Integer).toList();
    }
}
