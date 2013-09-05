package StacksAndQueues;

public interface QueueInterface<E> {
	public boolean isEmpty();
	
	public E dequeue();
	
	public void enqueue(E e);
	
	public void clear();
}
