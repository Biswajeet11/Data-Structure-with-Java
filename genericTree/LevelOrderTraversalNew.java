import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


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


public class LevelOrderTraversalNew {
	
	  public ArrayList<ArrayList<Integer>> levelOrder(Node A) {
	        Node root = A;
	        
	        
	        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	        Queue<Node> q = new LinkedList<>();

	        q.add(root);

	        while(!q.isEmpty()) {
	            int size = q.size();
	           
	            ArrayList<Integer> level = new ArrayList<>();
	            
	            for(int i=0;i<size;i++) {
	               Node temp = q.remove();
	             if(temp.left!= null) {
	                 q.add(temp.left);
	             }

	             if(temp.right!=null) {
	                 q.add(temp.right);
	             }

	             level.add(temp.val);

	            }

	            result.add(level);
	        }

	        return result;

	    }
	  
	  public static void main (String args []) {
		  
		  
		  Node root = new Node(5);
		  root.left = new Node(9);
		  
		  root.right = new Node(20);
		  root.right.left = new Node(15);
		  root.right.right = new Node(7);
		  
		  LevelOrderTraversalNew it = new LevelOrderTraversalNew();
		  
		  ArrayList<ArrayList<Integer>>  list =   it.levelOrder(root);
		  
		  System.out.print(list);
	  }

}
