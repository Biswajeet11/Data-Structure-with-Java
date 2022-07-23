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
public class ValidBST {
	
	 public int isValidBST(Node A) {
	        if(isValidBST(A,Integer.MIN_VALUE,Integer.MAX_VALUE)==false){
	            return 0;
	        }
	        return 1;
	    }
	     public boolean isValidBST(Node root, int minVal, int maxVal) {
	        if (root == null) return true;
	        if (root.val >= maxVal || root.val <= minVal) return false;
	        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
	    }
	     
	     
	     public static void main (String args[]) {
	    	 Node root = new Node(2);
	    	 root.left = new Node(1);
	    	 root.right = new Node(3);
	    	 
	    	 ValidBST bst = new ValidBST();
	    	 int val = bst.isValidBST(root);
	    	 System.out.print(val);
	     }

}
