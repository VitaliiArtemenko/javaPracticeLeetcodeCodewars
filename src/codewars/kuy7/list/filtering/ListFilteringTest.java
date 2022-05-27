package list.filtering;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListFilteringTest {

    @Test
    public void testFilterList() {
        assertEquals(List.of(1, 2), ListFiltering.filterList(List.of(1, 2, "a", "b")));
        assertEquals(List.of(1, 0, 15), ListFiltering.filterList(List.of(1, "a", "b", 0, 15)));
        assertEquals(List.of(1, 2, 123), ListFiltering.filterList(List.of(1, 2, "aasf", "1", "123", 123)));
        assertEquals(List.of(71), ListFiltering.filterList(List.of(71)));
        assertEquals(List.of(456, 940, 684, 70), ListFiltering.filterList(List.of(456, 940, 684, 70)));
    }
}