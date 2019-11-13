public class Task21 extends Task2 {
    @Override
    public void task2(int i) throws MyException {

        if (i>600){
            throw new MyException2(i);
        }
    }
}
