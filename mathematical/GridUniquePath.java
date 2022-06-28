/*
 * A robot is located at the top-left corner of an A x B grid (marked 'Start' in the diagram below).



The robot can only move either down or right at any point in time.
The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?



Problem Constraints

A and B will be such that the resulting answer fits in a 32 bit signed integer.



Input Format

First argument of input will be single integer A.
Second argument of input will be single integer B.



Output Format

Return a single integer denoting the number of unique paths.



Example Input

 A = 2, B = 2


Example Output

 2


Example Explanation

 2 possible routes : (0, 0) -> (0, 1) -> (1, 1) 
              OR  : (0, 0) -> (1, 0) -> (1, 1)
*/
public class GridUniquePath {
	
	 public static int uniquePaths(int A, int B) {
	        int sumValue =A+B-2;
	        int value= combination(sumValue, A-1);
	        return value;
	    }
	    
	    public static int combination(int n, int r){
	        
	        if(r > n - r) {
	            r = n - r;
	        } 
	        
	        int ncr = 1;
	        int i;
	        for (i=1;i<=r;i++){
	            ncr*=(n-i+1);
	            ncr/=i;
	        }
	        return ncr;
	        
	    }
	    
	    public static void main(String args[]) {
	    	int val = uniquePaths(2,2);
	    	System.out.print(val);
	    }

}
