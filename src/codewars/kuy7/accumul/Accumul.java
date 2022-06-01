package accumul;

public class Accumul {
    public static String accum(String s) {
       StringBuilder result = new StringBuilder();

       for (int i = 0; i < s.length(); i++) {
           result.append(Character.toUpperCase(s.charAt(i))).
                   append(String.valueOf(s.charAt(i)).toLowerCase().repeat(i)).append("-");

       }
       return result.substring(0, result.length() - 1);
    }
}
