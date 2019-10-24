
import java.util.Arrays;
import java.util.Comparator;

import common.IntegerComparator;
public class Classwork07 {

    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        Comparator comparator = new IntegerComparator();
        for (int i = 0; i < arr.length; i++) {
         arr[i] = i;
        }

        Arrays.sort(arr, comparator.reversed());

        System.out.println(Arrays.toString(arr));


    }

}
