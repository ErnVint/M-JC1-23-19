public class Task2 {
    public void task2(int i) throws MyException {
        if (i>500) {
            throw new MyException(i);
        }

    }
}
