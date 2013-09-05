/*
 * 2.3	Implement an algorithm to delete a node in the middle of a single linked list, given
 * only access to that node.
 * EXAMPLE
 * Input: the node ‘c’ from the linked list a->b->c->d->e
 * Result: nothing is returned, but the new linked list looks like a->b->d->e
 */

package LinkedLists;


public class TwoThree {
	public static void main(String[] args){
		
	}
	public static void delete(Node n){
		if(n.next==null||n==null)
			System.out.println("failure");
		else{
			Node next = n.next;
			n.data = next.data;
			n.next = next.next;
		}
	}
}
