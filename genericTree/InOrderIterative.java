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



public class InOrderIterative {
	
	
	public List<Integer> LDR(Node root) {
		
		
		List<Integer> list = new ArrayList<>();
		
		
		if(root == null) {
			return list; 
		}
		
		Stack<Node> st = new Stack<>();
		
		
		while(true) {
			
			if(root!=null) {
				st.add(root);
				root = root.left;
			}
			
			else {
				
				if(st.isEmpty()){
					break;
				}
				root = st.pop();
				list.add(root.val);
				root = root.right;

				}  	
			}	
		return list;
		}	
	
	public static void main (String args[]) {
		
		Node root = new Node(1);
		root.left = new Node(6);
		root.right = new Node(2);
		root.right.left = new Node(3);
		
		
		InOrderIterative itr = new InOrderIterative();
		
		List<Integer> list = itr.LDR(root);
		
		System.out.print(list);
	}

}
