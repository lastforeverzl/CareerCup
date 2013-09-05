package StacksAndQueues;

public class ListStack<E> implements StackInterface<E>{
	
	private Node<E> top;
	
	public ListStack(){
		top = null;
	}
	@Override
	public E pop() {
		if(isEmpty())	return null;	
		E result = top.data;
		top = top.next;
		return result;
	}

	@Override
	public void push(E element) {
		top = new Node<E>(element,top);
	}

	@Override
	public boolean isEmpty() {
		return top==null;
	}

	@Override
	public E peek() {
		if(isEmpty())	return null;
		E result = top.data;
		return result;
	}
	
	public void clear(){
		top = null;
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
		ListStack<Integer> list = new ListStack<Integer>();
		list.push(1);
		list.push(2);
		list.push(3);
		System.out.println("pop: " + list.pop());
		System.out.println("peak: " + list.peek());
	}

}
