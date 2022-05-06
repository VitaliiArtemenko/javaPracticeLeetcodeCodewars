package bingo;

import java.util.Arrays;

public class BingoOrNot {

    public static String bingo(int[] numberArray){
        int[] numbers = {2, 9, 14, 7, 15};
        String answer = "WIN";
        for (int number : numbers) {
            if (Arrays.stream(numberArray).noneMatch(el -> el == number)) {
               answer = "LOSE";
            }
        }
        return answer;
    }
}
