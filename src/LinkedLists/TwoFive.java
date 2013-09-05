/*
 * 2.5	Given a circular linked list, implement an algorithm which returns node at 
 * the beginning of the loop.
 * 
 * DEFINITION
 * Circular linked list: A (corrupt) linked list in which a node’s next pointer points to an
 * earlier node, so as to make a loop in the linked list.
 * 
 * EXAMPLE
 * Input: A -> B -> C -> D -> E -> C [the same C as earlier]
 * Output: C
 */

package LinkedLists;

public class TwoFive {
	public static void main(String[] args){
		CircularLinkedList list = new CircularLinkedList();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.addCircular(7,list.getNode(2));
		if(isCircularList(list))
			System.out.println("has circular");
		else
			System.out.println("has no circular");
		firstNodeOfLoop(list);
	}
	/*
	 * Checking circular in the linked list.
	 */
	public static boolean isCircularList(CircularLinkedList list){
		CircularNode n1 = list.getHead();
		CircularNode n2 = list.getHead();
		while(n2.next!=null){
			n1 = n1.next;
			if(n2.next.next!=null)
				n2 = n2.next.next;
			else
				return false;
			if(n1 == n2)
				return true;
		}
		return false;
	}
	
	public static void firstNodeOfLoop(CircularLinkedList list){
		CircularNode n1 = list.getHead();
		CircularNode n2 = list.getHead();
		while(n2.next!=null){
			n1 = n1.next;
			if(n2.next.next!=null)
				n2 = n2.next.next;
			else
				System.out.println("this list has no loop");
			if(n1==n2)
				break;
		}
		if(n2.next==null)
			System.out.println("this list has no loop");
		n1 = list.getHead();
		while(n1!=n2){
			n1 = n1.next;
			n2 = n2.next;
		}
		System.out.println("the beginning node of this loop is: "+n2.data);
	}
}

class CircularLinkedList{
	private CircularNode head;
	private int listCount;
	
	public CircularLinkedList(){
		this.head = new CircularNode(1);
		this.listCount=1;
	}
	
	public CircularNode getHead(){
		return head;
	}
	
	public void add(int data){
		CircularNode temp = new CircularNode(data);
		CircularNode current = head;
		while(current.next!=null){
			current = current.next;
		}
		current.next = temp;
		listCount++;
	}
	
	public void addCircular(int data, CircularNode next){
		CircularNode temp = new CircularNode(data, next);
		CircularNode current = head;
		while(current.next!=null){
			current = current.next;
		}
		current.next = temp;
		listCount++;
	}
	
	public int size(){
		return listCount;
	}

	public CircularNode getNode(int index){
		CircularNode current = head;
		for(int i=0;i<index;i++){
			current = current.next;
		}
		return current;
	}
	
	public int getData(int index){
		return getNode(index).getData();
	}
}
	
class CircularNode{
	CircularNode next;
	int data;
		
	public CircularNode(){
		
	}
	public CircularNode(int data){
		this.data = data;
		this.next = null;
	}
	public CircularNode(int data, CircularNode next){
		this.data = data;
		this.next = next;
	}
	public int getData(){
		return this.data;
	}
}
