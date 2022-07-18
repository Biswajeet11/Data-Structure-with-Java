import java.util.Deque;
import java.util.LinkedList;

public class MaximumSlidingWindow {
	
	  public static int[] maxSlidingWindow(int[] nums, int k) {
	        int n = nums.length;
	        int output [] = new int [n-k+1];
	        
	        Deque<Integer> q = new LinkedList<>();
	      
	        int index =0;
	        
	        for(int i=0;i<n;i++){
	            
	            if(!q.isEmpty() && q.getFirst() == i-k) {
	                q.removeFirst();
	            }
	            
	            while(!q.isEmpty() && nums[i]> nums[q.getLast()]){
	                q.removeLast();
	            }
	            
	            q.add(i);
	            
	            if(i>=k-1) { 
	                output[index++] = nums[q.peek()];
	            }
	            
	        }
	        return output;

	    }
	  
	  public static void main (String args[]) {
		  int arr[] = {1,3,-1,-3,5,3,6,7};
		  int k = 3;
		  int output[]= maxSlidingWindow(arr,k);
		  
		  for(int i=0;i<output.length;i++) {
			  System.out.println(output[i]);
		  }
		 
		  
	  }

}
