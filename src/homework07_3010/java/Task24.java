import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task24 {
    public static void sort(int[] a){
        List<Integer> list = new ArrayList<>();
        for (int numberArr:a
             ) {
            list.add(numberArr);
        }
        Collections.sort(list);
        for (int numberList:
             list) {
            System.out.println(numberList);
        }
        //или через list.get()
    }
}
