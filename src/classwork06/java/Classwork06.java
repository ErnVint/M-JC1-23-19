
import dto.BoxGeneric;
import dto.BoxObject;
import dto.IBox;

import java.util.ArrayList;
import java.util.List;


public class Classwork06 {
    public static void main(String[] args) {



        BoxGeneric<String> boxGeneric = new BoxGeneric<>();
        BoxGeneric<BoxObject> a1 = new BoxGeneric<>();

        boxGeneric.setItem("Test");

        String generic = (String) boxGeneric.getItem();

        List<String> coll = new ArrayList<String>();

        String[] arr = new String[0];
        coll.toArray(arr);

        //public static long summ(List<? extends IBox > boxes){
        //    long summ = 0;
        //    for (IBox box: boxes){
        //        summ += box.getCost();
        //    }
        //}
       /* public static void repackage(List<? extends BoxGeneric> source,
                                        List<? super BoxGeneric> dest) {
            for (BoxGeneric boxGeneric: source){
                dest.add(boxGeneric);
            }
        }
*/

        }

    }

