public class MyLinkedList<T> {

    private Node<T> head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }


    public void add(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            T data = head.data;
            head = head.next;
            size--;
            return data;
        }

        Node<T> previous = head;
        for (int i = 0; i < index - 1; i++) {
            previous = previous.next;
        }

        Node<T> removedNode = previous.next;
        previous.next = removedNode.next;
        size--;
        return removedNode.data;

    }

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }


}
