import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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


public class PreOrderTraversal {

	  public ArrayList<Integer> preorderTraversal(Node A) {
	        Stack<Node> stack = new Stack<>();
	        ArrayList<Integer> list = new ArrayList<>();

	        Node root = A;
	        if(root == null){
	            return list;
	        }
	        stack.add(root);

	        while(!stack.isEmpty()){
	            root = stack.pop();
	            list.add(root.val);

	            if(root.right!=null) {
	                stack.add(root.right);
	            }
	              if(root.left!=null) {
	                stack.add(root.left);
	            }
	        }
	        return list;
	    }
	  
	  public ArrayList<Integer> preorderTraversal2(TreeNode A) {
	        ArrayList<Integer> list = new ArrayList<>();
	        TreeNode root = A;
	        
	        if(root == null){
	            return list;
	        }

	        Stack<TreeNode> st = new Stack<>();

	        while(root!= null || !st.isEmpty()) {

	            if(root!=null){
	                list.add(root.val);
	                st.add(root);
	                root = root.left;
	            }
	            else {
	                TreeNode temp =  st.pop();
	                root = temp.right;
	            }

	        }
	        return list;
	    }
	  
	  
	  public static void main (String args[]) {
		  
		  
		  Node root = new Node(1);
			root.left = new Node(6);
			root.right = new Node(2);
			root.right.left = new Node(3);
			
			
			PreOrderTraversal itr = new PreOrderTraversal();
			
			List<Integer> list = itr.preorderTraversal(root);
			
			System.out.print(list);
		  
	  }
}
