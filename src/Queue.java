import java.util.Scanner;

/**
 * Generic queue implementation using a linked list.
 *
 * @param <T> the type of elements stored in the queue.
 */
class Queue<T> {
    private CustomLinkedList<T> list = new CustomLinkedList<>();

    /**
     * Adds an item to the end of the queue.
     *
     * @param item the item to be added to the end of the queue.
     */
    public void enqueue(T item) {
        list.addLast(item);
    }

    /**
     * Removes and returns the item at the front of the queue.
     *
     * @return the item at the front of the queue, or {@code null} if the queue is
     *         empty.
     */
    public T dequeue() {
        return list.removeFirst();
    }

    /**
     * Clears all elements from the queue.
     */
    public void clear() {
        list.clear();
    }

    /**
     * Prints the elements of the queue.
     */
    public void print() {
        list.printQueue();
    }

    /**
     * Checks if the queue is empty.
     *
     * @return {@code true} if the queue is empty, {@code false} otherwise.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Main method to test the Queue implementation with user input.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new Queue<>();
        String line;

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();

            if (line.equals("***")) {
                break;
            }

            String[] tokens = line.split(" ");
            String command = tokens[0];

            switch (command) {
                case "CLEAR":
                    queue.clear();
                    break;
                case "PRINT":
                    queue.print();
                    break;
                case "ENQUEUE":
                    queue.enqueue(tokens[1]);
                    break;
                case "DEQUEUE":
                    String dequeuedItem = queue.dequeue();
                    System.out.println(dequeuedItem != null ? dequeuedItem : "empty");
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }

        scanner.close();
    }
}
