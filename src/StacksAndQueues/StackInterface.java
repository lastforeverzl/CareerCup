package StacksAndQueues;

public interface StackInterface<T> {
	/**
     *  Removes and returns the item at the top of this stack.
     */
	
	public T pop();
	
	/**
     * Inserts a new item into the stack.
     */
	public void push(T element);
	
	public boolean isEmpty();
	
	/**
     *  Returns the top item without its removal
     */
	public T peek();
}
