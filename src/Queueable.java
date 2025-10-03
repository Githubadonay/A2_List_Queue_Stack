/**
 * Queue interface for a queue
 */
public interface Queueable<E> {
    /**
     * Inserts an element at the end of the queue
     * @ param element The element to be inserted
     */
    public void enqueue(E element);

    /**
     * Removes and returns the first element
     * 
     * @return element removed (or IllegalStateException if empty)
     */
    public E dequeue();

    /**
     * Returns, but does not remove, the first element
     * 
     * @return top element (or IllegalStateException if empty)
     */
    public E first();

    /**
     * Tests if the queue is empty
     * 
     * @return true if queue is empty; else false
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in the Queue
     * 
     * @return number of elements in the Queue
     */
    public int size();
}
