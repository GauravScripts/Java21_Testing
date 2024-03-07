package Virtual_Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SeamporeExample {
    private static final Semaphore POOL = new Semaphore(5);
    int count = 0;
    public void callOldService() throws InterruptedException {
        try {
            POOL.acquire();
            count++;
            System.out.println("Service is being called "+count);
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            POOL.release();
        }
    }
    public static void main(String[] args) {
        SeamporeExample seamporeExample = new SeamporeExample();
        ExecutorService executor = Executors.newFixedThreadPool(4); // create a thread pool with 4 threads
        for (int i = 0; i < 20; i++) {
            executor.submit(() -> {
                try {
                    seamporeExample.callOldService();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executor.shutdown(); // shut down the executor service
    }
}