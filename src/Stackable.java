/**
 * Stack interface for a stack
 */
public interface Stackable <E> {
    /**
     * Inserts an element at the top of the stack
     * @ param element  The element to be inserted
     */
    public void push(E element);

    /**
     * Removes and returns the top element
     * @return element removed (or null if empty)
     */ 
    public E pop (); 

    /**
     * Returns, but does not remove, the top element
     * @return top element (or null if empty)
     */
    public E top ();

    /**
     * Tests if the stack is empty
     * @return true if stack is empty; else false
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in the Stack
     * @return number of elements in the Stack
     */
    public int size(); 
    
    /**
     * Returns the value of the postfix expression.  */
    
    //public double postFix(String exp);
}
