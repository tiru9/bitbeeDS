package queue;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> elements;

    public Queue() {
        elements = new LinkedList<>();
    }

    // Add an element to the rear of the queue
    public void enqueue(T item) {
        elements.addLast(item);
    }

    // Remove and return the element at the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.removeFirst();
    }

    // Return the element at the front of the queue without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.getFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return elements.size();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeued: " + queue.dequeue()); // Output: Dequeued: 1
        System.out.println("Peek: " + queue.peek()); // Output: Peek: 2
        System.out.println("Size: " + queue.size()); // Output: Size: 2
        System.out.println("Is empty? " + queue.isEmpty()); // Output: Is empty? false
    }
}

