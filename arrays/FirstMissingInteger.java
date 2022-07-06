/*
 * Given an unsorted integer array, A of size N. Find the first missing positive integer.

Note: Your algorithm should run in O(n) time and use constant space.

*
*Input Format
First argument is an integer array A.



Output Format
Return an integer denoting the first missing positive integer.



Example Input
Input 1:

[1, 2, 0]
Input 2:

[3, 4, -1, 1]
Input 3:

[-8, -7, -6]


Example Output
Output 1:

3
Output 2:

2
Output 3:

1


Example Explanation
Explanation 1:

A = [1, 2, 0]
First positive integer missing from the array is 3.
*/


public class FirstMissingInteger {
	
	 public static void swap(int startIndex,int endIndex,int[] A){
         int temp=A[startIndex];
         A[startIndex]=A[endIndex];
         A[endIndex]=temp;
 }
 
  public static int firstMissingPositive(int[] A) {
     int n = A.length;
     
     for(int i=0;i<n;i++){
         if(A[i]>0 && A[i]<=n){
             int pos=A[i]-1;
             
              if(A[pos]!=A[i]){
                 swap(pos,i,A);
                 i--;
             }
         }
     }

     for(int i=0;i<n;i++) {
         if(A[i]!=(i+1)){
             return i+1;
             
         }
     }
     return n+1;
 }
	
	public static void main (String args[]) {
		
		int arr[] = {3, 4, -1, 1};
		int val = firstMissingPositive(arr);
		System.out.print(val);
		
	}

}
