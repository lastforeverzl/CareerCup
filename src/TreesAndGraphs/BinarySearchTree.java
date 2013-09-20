package TreesAndGraphs;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {
	private Node root;

	private class Node {
		private Key key;
		private Value val;
		private Node left, right;
		private int N;

		public Node(Key key, Value val, int N) {
			this.key = key;
			this.val = val;
			this.N = N;
		}
	}

	public int size() {
		return size(root);
	}
	private int size(Node node) {
		if (node == null)
			return 0;
		else
			return node.N;
	}

	// get()
	public Value get(Key key) {
		return get(root, key);
	}
	private Value get(Node node, Key key) {
		// Return value associated with key in the subtree rooted at x;
		// return null if key not present in subtree rooted at x.
		if (node == null)
			return null;
		int v = key.compareTo(node.key);
		if (v < 0)
			return get(node.left, key);
		else if (v > 0)
			return get(node.right, key);
		else
			return node.val;
	}

	//put()
	public void put(Key key, Value val) {
		// Search for key. Update value if found; grow table if new.
		root = put(root, key, val);
	}
	private Node put(Node node, Key key, Value val) {
		// Change key’s value to val if key in subtree rooted at x.
		// Otherwise, add new node to subtree associating key with val.
		if (node == null)
			return new Node(key, val, 1);
		int v = key.compareTo(node.key);
		if (v < 0)
			node.left = put(node.left, key, val);
		else if (v > 0)
			node.right = put(node.right, key, val);
		else
			node.val = val;
		node.N = size(node.left) + size(node.right) + 1;
		return node;
	}
	
	//min()
	public Key min(){
		return min(root).key;
	}
	private Node min(Node node){
		if(node.key == null)
			return node;
		return min(node.left);
	}
	
	//max()
	public Key max(){
		return max(root).key;
	}
	private Node max(Node node){
		if(node.key == null)
			return node;
		return max(node.right);
	}
	
	//pre-order
	public Key floor(Key key){
		Node x = floor(root, key);
		if(x == null)
			return null;
		return x.key;
	}
	private Node floor(Node x, Key key) {
		if (x == null)
			return null;
		int cmp = key.compareTo(x.key);
		if (cmp == 0)
			return x;
		if (cmp < 0)
			return floor(x.left, key);
		Node t = floor(x.right, key);
		if (t != null)
			return t;
		else
			return x;
	}
	
	//post-order
	public Key ceiling(Key key){
		Node x = ceiling(root, key);
		if(x == null)
			return null;
		return x.key;
	}
	private Node ceiling(Node x, Key key){
		if(x == null)
			return null;
		int cmp = key.compareTo(x.key);
		if(cmp == 0)
			return x;
		if(cmp > 0)
			return ceiling(x.right, key);
		Node t = ceiling(x.left, key);
		if(t != null)
			return t;
		else 
			return x;
	}
}
