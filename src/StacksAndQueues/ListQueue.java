package StacksAndQueues;

public class ListQueue<E> implements QueueInterface<E> {
	private Node<E> first;
	private Node<E> last;
	
	public ListQueue(){
		this.first = null;
		this.last = null;
	}
	
	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public E dequeue() {
		if(isEmpty())	return null;
		Node<E> temp = first;
		first = first.next;
		return temp.data;
	}

	@Override
	public void enqueue(E e) {
		Node<E> temp = new Node<E>(e);
		if(isEmpty()){
			first = temp;
			last = temp;
		}
		last.next = temp;
		last = temp;
	}

	@Override
	public void clear() {
		first = null;
	}
	
	private class Node<E>{
		public E data;
		public Node<E> next;
		
		public Node(E data){
			this(data, null);
		}
		public Node(E data, Node<E> next){
			this.data = data;
			this.next = next;
		}
	}
	
	public static void main(String[] args){
		ListQueue<Integer> queue = new ListQueue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println("dequeue: " + queue.dequeue());
		
	}
	
}
