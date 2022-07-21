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


public class SerializeTree {
	
	 public ArrayList<Integer> serialize(Node A) {
	        Queue<Node> queue = new LinkedList<>();
	        queue.add(A);
	     ArrayList<Integer> level = new ArrayList<>();
	     while (!queue.isEmpty()) {
	        int l = queue.size();
	        for (int i = 0; i < l; i++) {
	        	Node node = queue.remove(); 
	            if (node != null) {
	                level.add(node.val);
	                queue.add(node.left);
	                queue.add(node.right);
	            }
	            if(node==null){
	                level.add(-1);
	            }
	        }
	    }
	    return level;
	    }
	 
	 public static void main (String args[]) {
		 
		  
		  Node root = new Node(5);
		  root.left = new Node(9);
		  
		  root.right = new Node(20);
		  root.right.left = new Node(15);
		  root.right.right = new Node(7);
		  
		  SerializeTree it = new SerializeTree();
		  
		  ArrayList<Integer>  list =   it.serialize(root);
		  
		  System.out.print(list);
	 }

}
