/*
 * 3.3	
Imagine a (literal) stack of plates. If the stack gets too high, it might topple. There-
fore, in real life, we would likely start a new stack when the previous stack exceeds
some threshold. Implement a data structure SetOfStacks that mimics this. SetOf-
Stacks should be composed of several stacks, and should create a new stack once
the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should
behave identically to a single stack (that is, pop() should return the same values as it
would if there were just a single stack).
FOLLOW UP
Implement a function popAt(int index) which performs a pop operation on a specific
sub-stack.

 */
package StacksAndQueues;

import java.util.ArrayList;

public class ThreeThree {
	public static void main(String[] args){
		
	}
}

class SetOfStacks<E>{
	private int capacity;
	
	public SetOfStacks(int capacity){
		this.capacity = capacity;
	}
	ArrayList<MyStack<E>> stacks = new ArrayList<MyStack<E>>();
	
	public MyStack<E> getLastStack(){
		if(stacks.size()==0)	return null;
		return stacks.get(stacks.size()-1);
	}
	public void push(E data){
		MyStack<E> last = getLastStack();
		if(last!=null && !last.isAtCapacity()){
			last.push(data);
		}else{
			MyStack<E> stack = new MyStack<E>(capacity);
			stack.push(data);
			stacks.add(stack);
		}
	}
	
	public E pop(){
		MyStack<E> last = getLastStack();
		E value = last.pop();
		if(last.isEmpty())
			stacks.remove(stacks.size()-1);
		return value;
	}
	
	public E popAt(int index){
		MyStack<E> stack = stacks.get(index);
		E value = stack.pop();
		if(index!=stacks.size()-1){
			for(int i=index;i<stacks.size();i++){
				MyStack<E> temp = stacks.get(i);
				temp.push(stacks.get(i+1).removeBot());
			}
		}
		return value;
	}
	
	public E moveLeft(int index){
		
	}

}

class MyStack<E> extends ListStack<E>{
	private int capacity;
	private int size = 0;
	//private Node bot;
	
	public MyStack(int capacity){
		this.capacity = capacity;
	}
	public boolean isAtCapacity(){
		return capacity == size;
	}
	public E removeBot(){
		
	}
}
