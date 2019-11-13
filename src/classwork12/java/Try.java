import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.StampedLock;

public class Try {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        StampedLock lock = new StampedLock();
        final int[] count = {0};
        executor.submit(() -> {
            long stamp = lock.readLock();
            try {
                if (count[0] == 0) {
                    stamp = lock.tryConvertToWriteLock(stamp);
                    if (stamp == 0L) {
                        System.out.println("Could not convert to write lock");
                        stamp = lock.writeLock();
                    }
                    count[0] = 23;
                }
                System.out.println(count[0]);
            } finally {
                lock.unlock(stamp);
            }
        });

      //  stop(executor);
    }




    public static void stop(ExecutorService executor) {
        try {
            executor.shutdown();
            executor.awaitTermination(60, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("termination interrupted");
        }
        finally {
            if (!executor.isTerminated()) {
                System.err.println("killing non-finished tasks");
            }
            executor.shutdownNow();
        }
    }
}
