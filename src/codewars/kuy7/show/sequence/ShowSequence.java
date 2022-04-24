package show.sequence;

public class ShowSequence {

    public static String showSequence(int value) {
        if (value == 0) {
            return "0=0";
        }

        if (value < 0) {
            return value + "<0";
        }
        StringBuilder sequence = new StringBuilder("0");
        int sum = 0;

        for (int i = 1; i <= value; i++) {
            sequence.append("+").append(i);
            sum += i;
        }
        return sequence  + " = " + sum;
    }
}
