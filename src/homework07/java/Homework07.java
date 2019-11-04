public class Homework07 {
    public static void main(String[] args) {
        int i = 1;
        try {
            i=i/0;
        } catch (Exception e) {
            System.out.println("Cannot divided by zero.");
        }

//        try {
//            i=i/0;
//        }finally {
//            System.out.println(i);
//        }

        try {
            i=i/0;
        } catch (Exception e) {
            System.out.println("Cannot divided by zero.");
            i=100;
        }finally {
            System.out.println(i);
        }

        try {
            Task2 task2 = new Task2();
            task2.task2(501);
        } catch (MyException e) {
          //  e.printStackTrace();
            System.out.println(e);
            System.out.println("Task 2 done!");
        }

        try {
            Task21 task21 = new Task21();
            task21.task2(700);
        } catch (MyException e) {
         //   e.printStackTrace();
            System.out.println(e);
            System.out.println("Task 2.1 done");
        }

    }



}
