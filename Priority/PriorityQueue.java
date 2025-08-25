import java.util.ArrayList;
import java.util.List;

public class PriorityQueue<T> {
    private List<PriorityNode<T>> queue;

    public PriorityQueue() {
        queue = new ArrayList<>();
    }

    public void push(int priority, T data) {
        PriorityNode<T> node = new PriorityNode<>(priority, data);
        queue.add(node);
        queue.sort((a, b) -> a.getPriority() - b.getPriority()); // Orden ascendente por prioridad
    }

    public T pop() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0).getData();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
