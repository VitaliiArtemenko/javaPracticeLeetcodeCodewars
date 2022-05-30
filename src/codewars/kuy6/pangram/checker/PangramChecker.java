package pangram.checker;

public class PangramChecker {
    public static boolean check(String sentence){
        return sentence.toLowerCase().chars().filter(el -> el >= 'a' && el <= 'z').distinct().count() == 26;
    }
}
