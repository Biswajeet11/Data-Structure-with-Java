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

public class BSTNodeInRange {
	
	 public int getInRange(Node A, int B, int C) {
		     int ans = 0;
	         getCount(A,B,C);
	         return ans;
	    }
	    public void  getCount(Node A, int B, int C){
	        int low = B;
	        int high = C;
	        if(A == null)
	            return;
	 
	        // If current node is in range, then
	        // include it in count and recur for
	        // left and right children of it
	        if(A.val >= low && A.val <= high) {
	           ans ++;	
	        }         
	        getCount(A.left, low, high);  
	        getCount(A.right, low, high);
	    }

		public static void main (String args[]) {
			
			Node root = new Node(15);
			root.left = new Node(12);
			root.right = new Node(20);
			root.left.left = new Node(10);
			root.left.right = new Node(14);
			root.left.left.left = new Node(8);
			root.right.left = new Node(16);
			root.right.right = new Node(27);
			
			
			BSTNodeInRange range = new BSTNodeInRange();
			
			int count = range.getInRange(root,12,20);
			System.out.print(count);
		}
}
