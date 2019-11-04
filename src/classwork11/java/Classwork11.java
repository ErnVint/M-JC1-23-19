
import java.*;
import java.util.Random;

public class Classwork11 {
   volatile static int a = 1;

    public static void main(String[] args) throws InterruptedException {
            Job job = new Job();
        Thread t1 = new Thread(job);
        Thread t2 = new Thread(job);
        Thread t3 = new Thread(job);
        Thread t4 = new Thread(job);
        Thread t5 = new Thread(job);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
t2.join();

        System.out.println(" "+ a);


    }

    private static class Job implements Runnable {

        @Override
        public void run() {
            int count = 10;
            for (int i = 0; i < count; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               // System.out.println(Thread.currentThread().getName());
                a += i;
                System.out.println(a);
            }
        }
    }


}