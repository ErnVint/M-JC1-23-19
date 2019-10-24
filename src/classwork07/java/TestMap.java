import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMap {
    private final List<String> list = Collections.unmodifiableList(Arrays.asList());
    private int in;
    private String str;

    public List<String> getList() {
        return list;
    }



    public int getIn() {
        return in;
    }

    public void setIn(int in) {
        this.in = in;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "TestMap{" +
                "list=" + list +
                ", in=" + in +
                ", str='" + str + '\'' +
                '}';
    }
}
