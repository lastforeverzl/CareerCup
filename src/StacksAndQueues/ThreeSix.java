/*
 * 3.6	
Write a program to sort a stack in ascending order. You should not make any assump-
tions about how the stack is implemented. The following are the only functions that
should be used to write this program: push | pop | peek | isEmpty.

 */
package StacksAndQueues;

import java.util.Stack;

public class ThreeSix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(8);
		stack.add(7);
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(5);
		stack.add(6);
		Stack<Integer> stackInSort = new Stack<Integer>();
		stackInSort = sort(stack);
		System.out.println(stackInSort.peek());
	}
	public static Stack<Integer> sort(Stack<Integer> s) {		
		Stack<Integer> r = new Stack<Integer>();			
		while(!s.isEmpty()) {
			int tmp = s.pop();
			while(!r.isEmpty() && r.peek() > tmp) {			
				s.push(r.pop());			
			}
			r.push(tmp);			
		}
		return r;
	}
}
