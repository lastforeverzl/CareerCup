package LinkedLists;

public class MyLinkedList {
	private Node head;
	private int listCount;
	
	public MyLinkedList(){
		head = new Node(null);
		listCount = 0;
	}
	public void add(Object data){
		Node temp = new Node(data);
		Node current = head;
		while(current.getNext()!=null){
			current = current.getNext();
		}
		current.setNext(temp);
		listCount++;
	}
	public void insert(Object data, int index){
		if(index>listCount){
			System.out.print("out of size");
		}else{
			Node temp = new Node(data);
			Node current = head;
			for(int i=1;i<index;i++){
				current = current.getNext();
			}
			temp.setNext(current.getNext());
			current.setNext(temp);
			listCount++;
		}
	}
	/*
	 * please get index from 1
	 */
	public Object get(int index){

		Node current = head;
		for(int i=0;i<index;i++){
			current = current.getNext();
		}
		return current.getData();
	}
	public void remove(int index){
		if(index>size()||index<1){
			System.out.println("remove method out of size");
		}else{
			Node current = head;
			for(int i=1;i<index;i++){
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
			listCount--;
		}
	}
	public int size(){
		return listCount;
	}
	
	public static void main(String[] args){
		MyLinkedList list = new MyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.remove(3);
		System.out.println(list.size());
		System.out.println(list.get(3));
		
	}
}

class Node {
	Node next;		
	Object data;
		
	public Node(Object data) { 
		this.data = data; 
		this.next = null;
	}
	public Node(Object data,Node next){
		this.data = data;
		this.next = next;
	}
	public Object getData(){
		return data;
	}
	public Node getNext(){
		return next;
	}
	public void setData(Object data){
		this.data = data;
	}
	public void setNext(Node next){
		this.next = next;
	}
}
