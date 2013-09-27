/*
 * 4.6	
Design an algorithm and write code to find the first common ancestor of two nodes
in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not
necessarily a binary search tree.

 */
package TreesAndGraphs;

public class FourSix {
	static int TWO_NODES_FOUND = 2;
	static int ONE_NODES_FOUND = 1;
	static int NO_NODES_FOUND = 0;
	
	int covers(TreeNode root, TreeNode p, TreeNode q){
		int ret = NO_NODES_FOUND;
		if(root == null)
			return ret;
		if(root == p || root == q)
			ret += 1;
		// search left side
		ret += covers(root.left, p, q);
		if(ret == TWO_NODES_FOUND)
			return ret;
		//search right side
		return ret + covers(root.right, p, q);
	}
	
	TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q){
		if(q == p && (root.left == q || root.right == q))
			return root;
		
		int nodesFromLeft = covers(root.left, p, q);
		if(nodesFromLeft == TWO_NODES_FOUND){
			if(root.left == p || root.left == q)
				return root.left;
			else return commonAncestor(root.left, p, q);
		}
		
		int nodesFromRight = covers(root.right, p, q);
		if(nodesFromRight == TWO_NODES_FOUND){
			if(root.right == p || root.right == q)
				return root.right;
			else return commonAncestor(root.right, p, q);
		}
		
		if(nodesFromLeft == ONE_NODES_FOUND && nodesFromRight == ONE_NODES_FOUND)
			return root;
		else return null;
		
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
	TreeNode root, left, right;
}
