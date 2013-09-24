package TreesAndGraphs;

public class FourOne{
	
	public int maxDepth(Node root){
		if(root == null)
			return 0;
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	
	public int minDepth(Node root){
		if(root == null)
			return 0;
		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}
	
	public boolean isBalanced(Node root){
		return (maxDepth(root) - minDepth(root) <= 1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Node{
	Node left;
	Node right;
	int data;
}
