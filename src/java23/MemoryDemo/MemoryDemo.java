package java23.MemoryDemo;
import java.lang.foreign.*;

public class MemoryDemo {
    public static void main(String[] args) {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment segment = arena.allocate(100); // 100 byte natív memória
            System.out.println("Segment size: " + segment.byteSize());
        }
    }
}
