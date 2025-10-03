public class List<E> implements Listable<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public void addToHead(E data) {
        Node<E> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        }else{
        newNode.next = head;
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        }
        size++;

    }

    public void addToTail(E data) {
        Node<E> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        }else{
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        }
        size++;
    }

    public E remove() {
        if (isEmpty()) {
            throw new IllegalStateException();
        } 
        E temp = head.data;
        head = head.next;
        size--;
        return temp;
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
            Node<E> currentNode = head;
            String returnValue = "{" + currentNode.data;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                returnValue += "," + currentNode.data;
            }
            returnValue += "}";
            return returnValue;
        }
    }

    /** Node class definition (inner class) **/

    private class Node<E> {

        private Node<E> prev;
        private Node<E> next;
        private E data;

        private Node(E data) {
            this.data = data;
        }
    }
}
