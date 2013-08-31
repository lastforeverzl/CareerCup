/*
 * 2.1	
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */

package LinkedLists;

public class TwoOne {
	public static void main(String[] args){
		Node head = new Node(1);
	}
	public static void deleteDups(Node head){
		if(head ==null)	return;
		Node previous = head;
		Node current = previous.next;
		while(current!=null){
			Node runner = head;
			while(runner!=current){
				if(runner.data == current.data){
					Node temp = current.next;
					previous.next= temp;
					current = temp;
					break;
				}
				runner = runner.next;
			}
			if(runner==current){
				previous=current;
				current=current.next;
			}
		}
	}
}
