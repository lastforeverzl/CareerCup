/*
 * 3.2	How would you design a stack which, in addition to push and pop, also has a function 
 * min which returns the minimum element? Push, pop and min should all operate in 
 * O(1) time.
 */
package StacksAndQueues;

public class ThreeTwo {
	public static void main(String[] args){
		TrackMinStack s = new TrackMinStack();
		
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(1);
		s.pop();
		System.out.println(s.min());
	}

}

class TrackMinStack extends ListStack<Integer>{
	ListStack<Integer> trackMin;
	public TrackMinStack(){
		trackMin = new ListStack<Integer>();
	}
	
	public void push(int data){
		if(data<=min())
			trackMin.push(data);
		super.push(data);
	}
	
	public Integer pop(){
		int value = super.pop();
		if(value==min())
			trackMin.pop();
		return value;
	}
	
	public int min(){
		if(trackMin.isEmpty())
			return Integer.MAX_VALUE;
		else
			return trackMin.peek();
	}
}
