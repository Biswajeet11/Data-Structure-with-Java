import java.util.List;


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


public class InOrderToPostOrder {
	
	public Node buildTree(int[] A, int[] B) {
        return buildTrees(A,0,A.length-1,B,0,B.length-1);
    }
    public Node buildTrees(int[] A,int as,int ae, int[] B,int bs ,int be) {
        if(as>ae){
            return null;
        }
        if(as==ae){
            return new Node(A[as]);
        }
        int val=B[be];
        Node root=new Node(val);
        int j=as;
        for(int i=as;i<=ae;i++){
            if(val==A[i]){
                j=i;
                break;
            }
        }
        root.left=buildTrees(A,as,j-1,B,bs,bs+(j-1-as));
        root.right=buildTrees(A,j+1,ae,B,bs+(j-as),be-1);
        return root;
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
    	int A []= {6, 1, 3, 2};
    	int B [] = {6, 3, 2, 1};
			
			
			InOrderToPostOrder itr = new InOrderToPostOrder();
			
		    Node root = itr.buildTree(A,B);
		    
		    itr.printTree(root,"");
	 }

}
