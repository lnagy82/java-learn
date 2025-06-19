package java19.VirtualThread;

import java.util.concurrent.Executors;

public class ManyVirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 1_000_000; i++) {
                int id = i;
                executor.submit(() -> {
                    Thread.sleep(1000);
                    if (id % 100_000 == 0) {
                        System.out.println("Finished task #" + id);
                    }
                    return null;
                });
            }
        } // auto-shutdown
    }
}
