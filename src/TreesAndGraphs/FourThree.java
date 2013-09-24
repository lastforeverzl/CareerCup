/*
 * 4.3	
Given a sorted (increasing order) array, write an algorithm to create a binary tree with
minimal height.

 */

package TreesAndGraphs;

public class FourThree {
	public void createMinimalHeightTree(int arr[]){
		addToTree(arr,0,arr.length-1);
	}
	
	public TreeNode addToTree(int arr[], int start, int end){
		if(start>end)
			return null;
		int mid = (start + end) / 2;
		TreeNode node = new TreeNode(arr[mid]);
		node.left = addToTree(arr, start, mid-1);
		node.right = addToTree(arr, mid, end);
		return node;			
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class TreeNode{
	int data;
	TreeNode left, right;
	public TreeNode(int data){
		this.data = data;
	}
}
