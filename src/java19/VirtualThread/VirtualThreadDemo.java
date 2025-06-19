package java19.VirtualThread;

/**
 * 🎓 Miért kellett ez?
 * A klasszikus Thread:
 * ✅ Stabil, de nehéz (OS thread).
 * ✅ Limitált (~10k körül elkezd fogyni a memóriád).
 * ✅ Sok blokkolás → drága context switch.
 * 
 * A Virtual Thread:
 * ✅ Gyorsan indul.
 * ✅ Minimális memória (kb. egy stack frame).
 * ✅ Több millió is futhat párhuzamosan.
 * ✅ A JVM magán belül „parkolja” a blokkoló hívásokat — nem az OS szálra vár.
 */
public class VirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            System.out.println("Running in: " + Thread.currentThread());
        };

        // Klasszikus platform Thread
        Thread platformThread = Thread.ofPlatform().start(task);

        // Virtuális Thread (Java 19+, preview)
        Thread virtualThread = Thread.ofVirtual().start(task);

        platformThread.join();
        virtualThread.join();
    }
}
