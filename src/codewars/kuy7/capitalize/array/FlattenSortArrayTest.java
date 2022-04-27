package capitalize.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlattenSortArrayTest {

    @Test
    public void flattenAndSortBasicTests() {
        assertArrayEquals(new int[]{}, FlattenSortArray.flattenAndSort(new int[][]{}));
        assertArrayEquals(new int[]{1}, FlattenSortArray.flattenAndSort(new int[][]{{}, {1}}));

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                FlattenSortArray.flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}));

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 100},
                FlattenSortArray.flattenAndSort(new int[][]{{1, 3, 5} ,{100}, {2, 4, 6}}));

        assertArrayEquals(new int[]{111, 222, 333, 444, 555, 666, 777, 888, 999},
                FlattenSortArray
                        .flattenAndSort(new int[][] {{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}}));
    }

    @Test
    public void flattenAndSortRandomTests() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                FlattenSortArray.flattenAndSort(new int[][]{{9, 7, 5, 3, 1}, {8, 6, 4, 2, 0}, {}, {1}}));

        assertArrayEquals(new int[] {64, 100, 202, 303, 503, 504, 2500, 4096},
                FlattenSortArray.flattenAndSort(new int[][]{{}, {}, {64}, {}, {504, 503}, {4096}, {},{303, 202},
                        {2500}, {}, {100}}));

        assertArrayEquals(new int[] {-9, -8, -7, -6, -5, -4, -3, -2, -1},
                FlattenSortArray.flattenAndSort(new int[][] {{-9, -8, -7, -6, -5, -4, -3, -2, -1}}));

        assertArrayEquals(new int[] {-8680, -7383, -6730, -6389, -4287, -3081, -3022, -1531, 612, 722, 1234, 1671,
                2020, 2414, 3408, 5328, 6130, 6555, 7652, 8756, 8903, 9286},
                FlattenSortArray.flattenAndSort(new int[][] {{8756, -7383, -8680, 3408, 2020, -3081, -6730, 6555,
                        -1531, 7652, -6389, 612}, {722, 2414, 5328, -3022, -4287, 6130, 1234, 8903, 9286, 1671}}));
    }
}