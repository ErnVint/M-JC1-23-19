import java.util.ArrayList;
import java.util.List;

public class TestFinal {
    public static void main(String[] args) {
       final TestMap testObj = new TestMap();
        System.out.println(testObj);
       testObj.getList().add("fds");
        testObj.setIn(10);
        testObj.setStr("fasdvb");


        System.out.println(testObj);
    }
}
