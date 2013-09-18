/*
 * 3.5	
Implement a MyQueue class which implements a queue using two stacks.

 */
package StacksAndQueues;

public class ThreeFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
class MyQueue<E>{
	ListStack<E> s1, s2;
	public MyQueue(){
		s1 = new ListStack<E>();
		s2 = new ListStack<E>();
	}
	
	public void enqueue(E data){
		s2.push(data);
	}
	public E dequeue(){
		if(!s2.isEmpty())
			return s2.pop();
		while(!s1.isEmpty())	s2.push(s1.pop());
		return s2.pop();
	}
	public void clear(){
		s1.clear();
		s2.clear();
	}
	
}