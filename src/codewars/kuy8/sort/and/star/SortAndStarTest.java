package sort.and.star;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortAndStarTest {

    @Test
    public void testTwoSort() {
        assertEquals("b***i***t***c***o***i***n", SortAndStar.twoSort(new String[]
                {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        assertEquals("a***r***e", SortAndStar.twoSort(new String[]
                {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
        assertEquals("D***a***r***k***C***o***i***n", SortAndStar.twoSort(new String[]
                {"DarkCoin", "Ethereum", "ProofOfWork", "Steem", "LiteCoin"}));
        assertEquals("i", SortAndStar.twoSort(new String[]{"i"}));
    }
}