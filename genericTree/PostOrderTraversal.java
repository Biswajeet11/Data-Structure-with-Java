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

public class PostOrderTraversal {

	 public ArrayList<Integer> postorderTraversal(Node A) {
	        ArrayList<Integer> list = new ArrayList<>();
	        ArrayList<Integer> newList = new ArrayList<>();

	        Node root = A;
	        
	        if(root == null){
	            return list;
	        }

	        Stack<Node> st = new Stack<>();

	        while(root!= null || !st.isEmpty()) {

	            if(root!=null){
	                list.add(root.val);
	                st.add(root);
	                root = root.right;
	            }
	            else {
	                Node temp =  st.pop();
	                root = temp.left;
	            }
	        }
	        int i=list.size()-1;

	        while(i>=0){
	            newList.add(list.get(i));
	            i--;
	        }
	        return newList;

	    }
	 
	 
	 public static void main (String args[]) {
		 Node root = new Node(1);
			root.left = new Node(6);
			root.right = new Node(2);
			root.right.left = new Node(3);
			
			
			PostOrderTraversal itr = new PostOrderTraversal();
			
			List<Integer> list = itr.postorderTraversal(root);
			
			System.out.print(list);
	 }
	
}
