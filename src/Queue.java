public class Queue<E> implements Queueable<E> {
    private E[] Data;
    private int f = 0;
    private int size = 0;

    private static int CAPACITY = 1000;
    public Queue() {
        Data = (E[]) new Object[CAPACITY];
    }

    public void enqueue(E data) throws IllegalStateException {
        if (size == Data.length) {
            throw new IllegalStateException("Queue is Full!");
        }else{
        int avail = (f + size) % Data.length;
        Data[avail] = data;
        }
        size++;
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E answer = Data[f];
        Data[f] = null;
        f = (f + 1) % Data.length;
        size--;
        return answer;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        } else {
            return Data[f];
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < size; i++) {
            int idx = (f + i) % Data.length;
            sb.append(Data[idx]);
            if (i < size - 1)
                sb.append(",");
        }
        sb.append("}");
        return sb.toString();
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
