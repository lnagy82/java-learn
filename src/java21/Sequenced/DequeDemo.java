package java21.Sequenced;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Sor mód: eleje → vége
        deque.addLast("A");
        deque.addLast("B");
        deque.addLast("C");

        System.out.println(deque); // [A, B, C]

        System.out.println("Remove first: " + deque.removeFirst()); // A
        System.out.println("After remove: " + deque); // [B, C]

        // Verem mód: elejére push-olunk
        deque.addFirst("X");
        System.out.println(deque); // [X, B, C]

        System.out.println("Remove last: " + deque.removeLast()); // C
        System.out.println("After remove last: " + deque); // [X, B]
    }
}
