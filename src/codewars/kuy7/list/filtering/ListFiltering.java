package list.filtering;

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(el -> el instanceof Integer).collect(Collectors.toList());
    }
}
