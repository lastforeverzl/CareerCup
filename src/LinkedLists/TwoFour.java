/*
 * 2.4	You have two numbers represented by a linked list, where each node contains a single digit. 
 * The digits are stored in reverse order, such that the 1’s digit is at the head of the list. 
 * Write a function that adds the two numbers and returns the sum as a linkedlist.
 * 
 * EXAMPLE
 * Input: (3 -> 1 -> 5), (5 -> 9 -> 2)
 * Output: 8 -> 0 -> 8
 */

package LinkedLists;

public class TwoFour {
	public static void main(String[] args){
		MyLinkedList l1 = new MyLinkedList();
		MyLinkedList l2 = new MyLinkedList();
		l1.add(3);
		l1.add(1);
		l1.add(5);
		l2.add(5);
		l2.add(9);
		l2.add(2);
		MyLinkedList l = addLists(l1,l2);
		for(int i=1;i<=l.size();i++){
			System.out.println(l.get(i));
		}
	}
	public static MyLinkedList addLists(MyLinkedList l1, MyLinkedList l2){
		MyLinkedList list = new MyLinkedList();
		int a=0,b=0,result = 0;
		for(int i=1;i<=l1.size();i++){
			a += (int)l1.get(i) * (int)Math.pow(10, i-1);
		}
		
		for(int j=1;j<=l2.size();j++){
			b += (int)l2.get(j) * (int)Math.pow(10, j-1);
		}
		result = a+b;
		while(true){
			list.add(result%10);
			result = result / 10;
			if(result / 10==0){
				list.add(result % 10);
				break;
			}
		}
		return list;
	}
}
