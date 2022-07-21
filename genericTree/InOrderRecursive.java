import java.util.ArrayList;
import java.util.List;

class Node {
	int val;
	Node left;
	Node right;
	
	Node (int val){
		this.val = val;
		left = null;
		right = null;
	}
}



public class InOrderRecursive {
	
	
	
	public  List<Integer> LDR(Node root) {
		List<Integer> list = new ArrayList<>();
		if(root == null) {
			return list;
		}
		
		LDRHelper(root,list);
		return list;
		
	}
	
	
	
	public  void LDRHelper(Node root, List<Integer> list) {
		
		if(root == null) {
			return;
		}
		
		if(root!=null) {
			if(root.left != null) {
				LDRHelper(root.left, list);
			}
			
			list.add(root.val);
			
			if(root.right!=null) {
				LDRHelper(root.right, list);
			}
		}
	
	}



	public static void main (String args[]) {
		
		
		Node root= new Node(1);
		root.left = null;
		root.right = new Node(2);
		root.right.left = new Node(3);
		
		
		InOrderRecursive rec = new InOrderRecursive();
		List<Integer> list = rec.LDR(root);
		
		System.out.println(list);
		
	}

}
