package name.value;

import java.util.Arrays;

public class NameValue {

    public static int [] nameValue(String [] arr){
        int[] values = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            values[i] = arr[i].chars().filter(el -> el != ' ').map(el -> el - 96).sum() * (i + 1);
        }
        return values;
    }
}