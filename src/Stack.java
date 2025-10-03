public class Stack<E> implements Stackable<E> {
    public static final int CAPACITY = 100;
    private E[] Data;
    private Node<E> top;
    private int size = 0;

    public Stack() {
        Data = (E[]) new Object[CAPACITY];
    }

    public void push(E data) {
        if (size() == CAPACITY) {
            throw new IllegalArgumentException();
        }
        Node<E> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        E answer = top.data;
        Node<E> oldTop = top;
        top = top.next;
        oldTop.next = null;
        size--;
        return answer;

    }

    public E top() {
        if (isEmpty()) {
            throw new IllegalStateException();
        } else {
            return top.data;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public String toString() {
        if (isEmpty())
            return "{}";
        else {
            Node<E> currentNode = top;
            String returnValue = "{" + currentNode.data;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                returnValue += "," + currentNode.data;
            }
            returnValue += "}";
            return returnValue;
        }
    }

    private class Node<E> {

        private Node<E> prev;
        private Node<E> next;
        private E data;

        private Node(E data) {
            this.data = data;
        }
    }
}
