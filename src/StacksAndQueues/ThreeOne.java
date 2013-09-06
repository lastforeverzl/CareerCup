/*
 * 3.1	Describe how you could use a single array to implement three stacks.
 */
package StacksAndQueues;

public class ThreeOne {
	public static void main(String[] args){
		oneArrayThreeStacks arr = new oneArrayThreeStacks();
		arr.push(1, 1);
		arr.push(2, 10);
		arr.push(3, 20);
		arr.push(1, 2);
		arr.push(2, 11);
		arr.push(3, 21);
		arr.push(1, 3);
		arr.push(1, 4);
		arr.push(1, 5);
		System.out.println(arr.pop(1));
		arr.getData();
			
	}
}

class oneArrayThreeStacks{
	final int STACK_SIZE = 10;
	int[] arr = new int[STACK_SIZE*3];
	int[] top = {0,STACK_SIZE,STACK_SIZE*2};
	
	public oneArrayThreeStacks(){
		for(int i=0;i<STACK_SIZE*3;i++){
			arr[i] = 0;
		}
	}
	
	public void push(int stackNumber, int data){
		if(top[stackNumber-1] < STACK_SIZE * stackNumber){
			int current = top[stackNumber-1];
			arr[current] = data;
			top[stackNumber-1]++;
		}else
			System.out.println("this stack is full!");
		
	}
	public int pop(int stackNumber){
		if(top[stackNumber-1] < STACK_SIZE * (stackNumber-1)){
			System.out.println("this stack is empty");
			return 0;
		}else{
			int current = top[stackNumber-1]-1;
			top[stackNumber-1]--;
			int result = arr[current];
			arr[current]=0;
			return result;
		}
	}
	public int peek(int stackNumber){
		if(top[stackNumber-1] < STACK_SIZE * (stackNumber-1)){
			System.out.println("this stack is empty");
			return 0;
		}else{
			int current = top[stackNumber-1]-1;
			return arr[current];
		}
	}
	public boolean isEmpty(int stackNumber){
		int current = top[stackNumber-1];
		if(current==STACK_SIZE * (stackNumber-1))
			return true;
		else
			return false;
		
	}
	public void getData(){
		for(int i=0;i<STACK_SIZE*3;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
