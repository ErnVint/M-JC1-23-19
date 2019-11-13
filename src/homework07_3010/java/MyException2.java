public class MyException2 extends MyException {
    public MyException2(int i) {
        super(i);
    }

    @Override
    public String toString() {
        return "MyException2{ "
                + i2 +
                " }";
    }
}
