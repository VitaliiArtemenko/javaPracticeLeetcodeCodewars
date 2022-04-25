package roman.numerals.encoder;

public class RomanNumeralsEncoder {

    public static String romanNumeralsEncoder(int n) {
        StringBuilder romanNumber = new StringBuilder();
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                n -= values[i];
                romanNumber.append(romanLiterals[i]);
            }
        }
        return romanNumber.toString();
    }
}
