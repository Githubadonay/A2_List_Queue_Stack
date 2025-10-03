/**
 * Linked List interface for a lined list
 */
public interface Listable <E> {
    /**
     * Inserts an element at the end of the list
     * @ param element  The element to be inserted
     */
    public void addToTail(E element);

    /**
     * Inserts an element at the front of the list
     * @ param element  The element to be inserted
     */
    public void addToHead(E element);

    /**
     * Removes and returns the first (head) element
     * @return element removed (or IllegalStateException if empty)
     */ 
    public E remove(); 

    /**
     * Tests if the list is empty
     * @return true if list is empty; else false
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in the Stack
     * @return number of elements in the Stack
     */
    public int size(); 

    
}
