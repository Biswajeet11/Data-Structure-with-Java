/*
 * 
Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.

Find the minimum cost to remove all elements from the array.

Output Format
Return an integer denoting the total cost of removing all elements from the array.



Example Input
Input 1:

 A = [2, 1]
Input 2:

 A = [5]


Example Output
Output 1:

 4
Output 2:

 5


Example Explanation
Explanation 1:

 Given array A = [2, 1]
 Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
 Remove 1 from the array => []. Cost of this operation is (1) = 1.
 So, total cost is = 3 + 1 = 4.
Explanation 2:

 There is only one element in the array. So, cost of removing is 5.
 */

import java.util.Arrays;

public class ElementRemoval {
	
	 public static int solve(int[] A) {
	        if(A.length == 1){
	            return A[0];
	        }
	        int sum = 0;
	        int retSum = 0;
	        Arrays.sort(A);
	        int arr[] = reverse(A);
	        
	        
	        for(int i=arr.length-1;i>=0;i--){
	            sum +=arr[i];
	            retSum +=sum;
	        }
	        return retSum;
	    }
	    
	    public static int[] reverse(int []arr){
	     int temp=0;
	     for( int i = 0; i < arr.length/2; ++i ){ 
	          temp = arr[i]; 
	          arr[i] = arr[arr.length - i - 1]; 
	          arr[arr.length - i - 1] = temp; 
	        }
	        return arr;
	    }
	    
	    public static void main(String args []) {
	    	 int [] A = {2, 1};
	    	 int val = solve(A);
	    	 System.out.println("val "+val);
	    }
	    
}
