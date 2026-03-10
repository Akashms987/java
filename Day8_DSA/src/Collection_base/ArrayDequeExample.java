package Collection_base;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> actions = new ArrayDeque<>();
        actions.addLast("User Types A");
        actions.addLast("User types B");
        actions.addLast("User Delete B");
        System.out.println("Undo: " + actions.remove());
        System.out.println("Remaining actions " + actions);
    }
}
