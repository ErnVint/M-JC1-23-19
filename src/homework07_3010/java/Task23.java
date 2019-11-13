import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task23 {
    public static int[] type() {
        System.out.println("Type your int: ");
        Scanner scanner = new Scanner(System.in);
        int[] a = {};
        int errCounter = 0;
        while (true) {
            try {
//                if (a.length>0){
//                    b = new int[a.length + 1];
//                    for (int i:a) {
//                        b[i] = a[i];
//                    }
//                }
                int[] b = Arrays.copyOf(a, (a.length+1));
                b[a.length] = Integer.parseInt(scanner.nextLine());
                a = b;
            } catch (NumberFormatException e) {
                if (errCounter < 2) {
                    System.out.println(e + "is not int");
                    ++errCounter;
                } else {
                    e.printStackTrace();
                    System.out.println(Arrays.toString(a));
                    return a;
                }

            }
        }
    }
}
