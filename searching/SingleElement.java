/*
 * 
 * Given a sorted array of integers A where every
 * element appears twice except for one element which appears once, 
 * find and return this single element that appears only once.

solve this in O(log(N)) time.

Input 1:

A = [1, 1, 7]
Input 2:

A = [2, 3, 3]


Example Output
Output 1:

 7
Output 2:

 2


Example Explanation
Explanation 1:

 7 appears once
Explanation 2:

 2 appears once

 * */
public class SingleElement {
	
	   public static int getSingleElement(int[] A) {
		   int ans = 0, n = A.length;
	        int low = 0, high = n-1;
	        while(low <= high){
	            int mid = (high - low)/2 + low;
	            if(mid == n - 1) 
	                return A[n-1];
	            if(A[mid] == A[mid+1]) 
	                mid++;
	            // if all elements with index < mid are occuring twice then mid should be odd
	            if(mid%2 == 1)
	                low = mid + 1;
	            else{
	                ans = mid;
	                high = mid - 1;
	            }
	        }
	        return A[ans];
	    }
	
	
	public static void main (String args[]) {
		int arr[]= {2, 3, 3};
		int val = getSingleElement(arr);
		System.out.print(val);
		
		
	}

}
