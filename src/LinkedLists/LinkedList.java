package LinkedLists;

public class LinkedList {
	public static void main(String[] args){
		Node node = new Node(1);
		node.appendToTail(2);
		node.appendToTail(3);
		node.next.insert(4);
		node.delete(2);
		System.out.println(node.next.data);
	}
}
class Node {
	Node next = null;		
	int data;
		
	public Node(int d) { data = d; }
	
	void appendToTail(int d) {		
		Node end = new Node(d);
		Node n = this;
		while (n.next != null) { n = n.next; }
		n.next = end;	
	}
	void insert(int d){
		Node new_node = new Node(d);
		Node n = this;
		new_node.next = n.next;
		n.next = new_node;
	}
	void delete(int d){
		Node head = this;
		if(head.data == d){
			head = head.next;
		}
		Node n = head;
		while(n.next!=null){
			if(n.next.data==d){
				n.next = n.next.next;
			}
			n=n.next;
		}
	}
}

