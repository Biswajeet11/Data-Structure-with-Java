/*
 * You are given an integer array A of size N.

You have to pick B elements in total. Some (possibly 0) elements from left
end of array A and some (possibly 0) from the right end of array A to get the maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4, and array A contains 10 elements, then

You can pick the first four elements or can pick the last four elements, 
or can pick 1 from front and 3 from the back, etc. You need to return the maximum possible sum of elements you can pick.


Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return an integer denoting the maximum possible sum of elements you picked.



Example Input
Input 1:

 A = [5, -2, 3 , 1, 2]
 B = 3
Input 2:

 A = [1, 2]
 B = 1


Example Output
Output 1:

 8
Output 2:

 2


Example Explanation
Explanation 1:

 Pick element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
Explanation 2:

 Pick element 2 from end as this is the maximum we can get*/

package problemSolvingSeries;

public class MaximumPossibleSum {
	
	public static  int solve(int[] A, int B) {
        int n = A.length;
        int []suff = new int[n + 1];
        suff[n] = 0;
        suff[n - 1] = A[n - 1];
        for(int i = n - 2; i >= 0; i--){
            suff[i] = A[i] + suff[i + 1];
        }
        
        int prefSum = 0;
        int ans = suff[n - B];
        for(int i = 0; i < B; i++){
        	prefSum = prefSum + A[i];
            int suffSum = suff[n - B + (i + 1)];
            ans = Math.max(ans, prefSum + suffSum);
        }
        return ans;
    }
	
	  public static int solve2(int[] A, int B) {
	        int sum1 = 0;
	        int sum2 = 0;
	        int min = 0;
	        int numberOfSmallElements = A.length-B;
	        
	        for(int i=0;i<A.length;i++){
	            sum1+= A[i];
	        }
	        
	        for(int j=0;j<numberOfSmallElements;j++){
	            sum2+= A[j];
	        }
	        
	        int k = numberOfSmallElements;
	        int i = 1; 
	        min = sum2;
	        while(k<A.length){
	            sum2+=A[k]-A[i-1];
	            min=Math.min(min,sum2);
	            k++;
	            i++;
	        }
	        return sum1-min;
	        
	    }
	
	public static void main(String args[]) {
		int [] A = {5, -2, 3 , 1, 2};
		int B = 3;
		int val = solve2(A,B);
		System.out.println(val);
	}

}
