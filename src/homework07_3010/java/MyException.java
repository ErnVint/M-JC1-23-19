public class MyException extends Exception {

        int i2 = 0;

        public MyException(int i){
            i2 = i;
        }

    @Override
    public String toString() {
        return "MyException{ " +
                i2 +
                " }";
    }
}
