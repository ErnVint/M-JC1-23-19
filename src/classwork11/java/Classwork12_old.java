public class Classwork12_old {
    static long a =0;
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            for (long i = 0; i < 100_000L; i++) {
                   a += 1;
                System.out.println("setter " + a);

            }
        });

        Thread t2 = new Thread(() ->{
            Thread curr = Thread.currentThread();
            while (!curr.isInterrupted()) {
                System.err.println("monitor "+a);
            }

            while (!curr.isInterrupted()) {
                System.err.println(a);
            }

        });




        t1.start();
        t2.start();


        try {
            t1.join();
            t2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
