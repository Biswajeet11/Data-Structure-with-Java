/*
 * Given a matrix of integers A of size N x M and an integer B. Write an efficient algorithm that searches for integer B in matrix A.

This matrix A has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than or equal to the last integer of the previous row.
Return 1 if B is present in A, else return 0.

NOTE: Rows are numbered from top to bottom, and columns are from left to right.


Input Format
The first argument given is the integer matrix A.
The second argument given is the integer B.



Output Format
Return 1 if B is present in A else, return 0.



Example Input
Input 1:

A = [ 
      [1,   3,  5,  7]
      [10, 11, 16, 20]
      [23, 30, 34, 50]  
    ]
B = 3
Input 2:

A = [   
      [5, 17, 100, 111]
      [119, 120, 127, 131]    
    ]
B = 3


Example Output
Output 1:

1
Output 2:

0


Example Explanation
Explanation 1:

 3 is present in the matrix at A[0][1] position so return 1.
Explanation 2:

 3 is not present in the matrix so return 0.*/


public class MatrixSearch {

	
	 Boolean found = false;
	 
	 public int findElement(int A[][], int B) {
		 
		    int n = A.length, m = A[0].length;
	        int low = 0, high = n * m - 1, ans = -1;
	  
	 while(low <= high){
         int mid = (high - low) / 2 + low;
         int row = mid / m, col = mid % m;
         if(A[row][col] > B) 
             high = mid - 1;
         else{
             ans = mid;
             low = mid + 1;
         }
     }
     if(ans == -1 || A[ans / m][ans % m] != B) 
         return 0;
     return 1;
	 }
	 
	 
	 public  int searchMatrix(int[][] A, int B) {
	        int col = A[0].length;
	        find(A,0,col-1,B);
	        return found?1:0;
	    }
	    
	    public  void find(int[][] A, int row, int col, int B)
	    {
	        if(col<0 || row>A.length-1)
	            return;
	        if(A[row][col] == B)
	        {
	            found = true;
	            return;
	        }
	        else if(A[row][col] > B)
	            find(A, row, col-1, B);
	        else
	            find(A, row+1, col, B);
	    }
	
	
	public static void main (String args[]) {
		
		int A[][] = { 
		      {1,   3,  5,  7},
		      {10, 11, 16, 20},
		      {23, 30, 34, 50}  
		};
		int B = 3;
		
		MatrixSearch search = new MatrixSearch();
		int val = search.searchMatrix(A,B);
		System.out.print(val);
	}
}
