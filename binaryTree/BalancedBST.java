class Node {
	int val;
	Node left;
	Node right;
	
	Node(int val){
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class BalancedBST {
	
	  private int result = 1;
	    public int isBalanced(Node A) {
	        maxDepth(A);
	       return result;
	    }
	    public int maxDepth(Node root) {
	    if (root == null)
	        return 0;
	    int l = maxDepth(root.left);
	    int r = maxDepth(root.right);
	    if (Math.abs(l - r) > 1)
	        result = 0;
	    return 1 + Math.max(l, r);
	    }
	    
public static void main (String args[]) {
			
			Node root = new Node(1);
			root.left = new Node(2);
			root.right = new Node(3);
			
			
			BalancedBST balanced = new BalancedBST();
			
			int count = balanced.isBalanced(root);
			System.out.print(count);
		}

}
