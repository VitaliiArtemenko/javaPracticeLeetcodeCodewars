package gift.sorter;

import java.util.Arrays;

public class GiftSorter {

    public static String sortGiftCode(String code){
        char[] characters = code.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }
}
