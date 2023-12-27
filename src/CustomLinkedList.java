/**
 * Node class representing a single element in a linked list.
 *
 * @param <T> the type of data stored in the node.
 */
class Node<T> {
    T data;
    Node<T> next;

    /**
     * Constructs a new node with the specified data.
     *
     * @param data the data to be stored in the node.
     */
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

/**
 * CustomLinkedList class representing a singly linked list.
 *
 * @param <T> the type of elements stored in the linked list.
 */
class CustomLinkedList<T> {
    private Node<T> head;

    /**
     * Adds a new element to the beginning of the linked list.
     *
     * @param item the item to be added to the beginning of the list.
     */
    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Adds a new element to the end of the linked list.
     *
     * @param item the item to be added to the end of the list.
     */
    public void addLast(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            // If the list is empty, make the new node the head
            head = newNode;
        } else {
            // Iterate to the last node and add the new node
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    /**
     * Removes and returns the first element from the linked list.
     *
     * @return the data of the first element, or {@code null} if the list is empty.
     */
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T data = head.data;
        head = head.next;
        return data;
    }

    /**
     * Clears all elements from the linked list.
     */
    public void clear() {
        head = null;
    }

    /**
     * Checks if the linked list is empty.
     *
     * @return {@code true} if the list is empty, {@code false} otherwise.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Prints the elements of the linked list in reverse order (as a stack).
     */
    public void printStack() {
        printReverseHelper(head);
    }

    /**
     * Helper method to print the elements of the linked list in reverse order
     * recursively.
     *
     * @param current the current node in the recursion.
     */
    private void printReverseHelper(Node<T> current) {
        if (current == null) {
            return;
        }
        printReverseHelper(current.next);
        System.out.println(current.data + " ");
    }

    /**
     * Prints the elements of the linked list as a queue.
     */
    public void printQueue() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
}
