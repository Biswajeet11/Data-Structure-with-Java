/*
 * 
 * Given a binary tree and a sum,
 * determine if the tree has a root-to-leaf path such that adding up all the values along 
 * the path equals the given sum.*/

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



public class PathSum {

	 public int hasPathSum(Node A, int B) {
         if(A == null){
           return 0;
       }
       B-=A.val;
       if(A.left==null && A.right==null && B==0){
           return 1;
       }
       if( hasPathSum(A.left,B) == 1 || hasPathSum(A.right,B) ==1){
           return 1;
       }
       else {
           return 0;
       }
   }
	 
	 public static void main (String args[]) {
		 Node root = new Node(5);
		 root.left = new Node(4);
		 root.right = new Node(8);
		 
		 root.left.left = new Node(11);
		 root.left.left.left = new Node(7);
		 root.left.left.right = new Node(2);
		 
		 root.right.left = new Node(13);
		 root.right.right = new Node(4);
		 root.right.right.right = new Node(1);
		 
		 PathSum pathSum = new PathSum();
		 int k = 22;
		 System.out.print(pathSum.hasPathSum(root,k ));
		 
	 }
	
	
}
