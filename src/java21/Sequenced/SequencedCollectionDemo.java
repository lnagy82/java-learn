package java21.Sequenced;

import java.util.LinkedList;
import java.util.SequencedCollection;

public class SequencedCollectionDemo {
    public static void main(String[] args) {
        SequencedCollection<String> list = new LinkedList<>();
        list.addFirst("first");
        list.addLast("last");

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        System.out.println("Reversed: " + list.reversed());
    }
}
