import java.util.Scanner;

/**
 * Generic stack implementation using a linked list.
 *
 * @param <T> the type of elements stored in the stack.
 */
class Stack<T> {
    private CustomLinkedList<T> list = new CustomLinkedList<>();

    /**
     * Pushes an item onto the top of the stack.
     *
     * @param item the item to be pushed onto the stack.
     */
    public void push(T item) {
        list.addFirst(item);
    }

    /**
     * Removes and returns the item at the top of the stack.
     *
     * @return the item at the top of the stack, or {@code null} if the stack is
     *         empty.
     */
    public T pop() {
        return list.removeFirst();
    }

    /**
     * Clears all elements from the stack.
     */
    public void clear() {
        list.clear();
    }

    /**
     * Prints the elements of the stack.
     */
    public void print() {
        list.printStack();
    }

    /**
     * Checks if the stack is empty.
     *
     * @return {@code true} if the stack is empty, {@code false} otherwise.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Main method to test the Stack implementation with user input.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String line;

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();

            if (line.equals("***")) {
                break;
            }

            String[] tokens = line.split(" ");
            String command = tokens[0];

            switch (command) {
                case "PUSH":
                    stack.push(tokens[1]);
                    break;
                case "POP":
                    String poppedItem = stack.pop();
                    System.out.println(poppedItem != null ? poppedItem : "empty");
                    break;
                case "CLEAR":
                    stack.clear();
                    break;
                case "PRINT":
                    stack.print();
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }

        scanner.close();
    }
}
