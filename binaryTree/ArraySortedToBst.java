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


public class ArraySortedToBst {
	
	   public Node sortedArrayToBST(final int[] A) {
	        if (A.length == 0) {
	        return null;
	        }
	        Node head = helper(A, 0, A.length - 1);
	       return head;
	    }
	    public Node helper(int[] num, int low, int high) {
	    if (low > high) { 
	        return null;
	    }
	    int mid = (low + high) / 2;
	    Node node = new Node(num[mid]);
	    node.left = helper(num, low, mid - 1);
	    node.right = helper(num, mid + 1, high);
	    return node;
	   }
	    
	    public void printTree(Node root, String s) {
	    	
	    	
	    	if(root == null) {
	    		return;
	    	}
	    	
	    	String str = s + root.val;
	    	
	    	  System.out.println(str);
	        
	        if(root.left!=null) {
	        	printTree(root.left, str+"->" +"left->");
	        	 
	        }
	       
	        if(root.right!=null) {
	        	printTree(root.right, str+"->"+ "right->");
	        }

	      }
	    
	    public static void main (String args[]) {
	    	int arr [] = {1, 2, 3, 5, 10};
	    	
	    	ArraySortedToBst st = new ArraySortedToBst();
	    	Node root = st.sortedArrayToBST(arr);
	    	
	    	st.printTree(root, "");
	    }
}
