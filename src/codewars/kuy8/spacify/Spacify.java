package spacify;

public class Spacify {
    public static String spacify(String str){
        return String.join(" ", str.split(""));
    }
}
