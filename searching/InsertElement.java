/*
 * 
 * 
 * 
 * Given a sorted array A of size N and a target value B, return the index (0-based indexing) if the target is found.
If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array. Users are expected to solve this in O(log(N)) time.


Input 1:

A = [1, 3, 5, 6]
B = 5 
Input 2:

A = [1]
B = 1


Example Output
Output 1:

2 
Output 2:

0

*/
public class InsertElement {

	
	  public static int searchInsert(int[] A, int B) {
          int n=A.length;
          int low=0,high=n-1;
          int mid=low+(high-low)/2;
    
      while(low<=high){
            mid=low+(high-low)/2;
            if(A[mid] == B)
             return mid;
            else if(B>A[mid]) low=mid+1;
            else high=mid-1;
        }       
    return low;
    }
	
	  
	  public static void main (String args[]) {
		 int [] A = {1, 3, 5, 6};
		 int B = 5; 
		 int index = searchInsert(A,B);
		 System.out.print(index);
	  }
	  
	  
}
