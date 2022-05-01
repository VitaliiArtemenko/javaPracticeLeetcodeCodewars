package alphabet.war;

import java.util.*;

public class AlphabetWar {

    public static String alphabetWar(String fight){
        int left = 0;
        int right = 0;

        for (char c : fight.toCharArray()) {
            switch (c) {
                case 'w' -> left += 4;
                case 'p' -> left += 3;
                case 'b' -> left += 2;
                case 's' -> left++;
                case 'm' -> right += 4;
                case 'q' -> right += 3;
                case 'd' -> right += 2;
                case 'z' -> right++;
            }
        }
        if (left > right) {
            return "Left side wins!";
        } else if (left < right) {
            return "Right side wins!";
        } else {
            return "Let's fight again!";
        }
    }
}
