import java.util.Arrays;

/*
 * 
Implement the next permutation, which rearranges numbers into the numerically next greater
permutation of numbers for a given array A of size N.

If such arrangement is not possible, it must be rearranged as the lowest possible order, i.e., sorted in ascending order.

NOTE:

The replacement must be in-place, do not allocate extra memory.


Problem Constraints
1 <= N <= 5 * 105

1 <= A[i] <= 109



Input Format
The first and the only argument of input has an array of integers, A.



Output Format
Return an array of integers, representing the next permutation of the given array.



Example Input
Input 1:

 A = [1, 2, 3]
Input 2:

 A = [3, 2, 1]


Example Output
Output 1:

 [1, 3, 2]
Output 2:

 [1, 2, 3]


Example Explanation
Explanation 1:

 Next permutation of [1, 2, 3] will be [1, 3, 2].
Explanation 2:

 No arrangement is possible such that the number are arranged into the numerically next greater permutation of numbers.
 So will rearranges it in the lowest possible order.
*/
public class NextPermutation {
	
	  public static int[] nextPermutation(int[] A) {

	        int idx1 = -1;

	        int idx2 = 0;

	        int n = A.length;

	        for(int i=n-2;i>=0;i--) {

	            if(A[i+1]>A[i]){

	                idx1 = i;

	                break;

	            }

	        }

	        if(idx1<0) {

	            Arrays.sort(A);

	            return A;

	        }

	        for(int i=n-1; i>=idx1; i-- ){

	            if(A[i]>A[idx1]) {

	                idx2 = i;

	                break;

	            }

	        }

	        swap(idx1,idx2,A);

	        reverse(idx1+1,A.length-1,A);

	        return A;

	    }

	    public static void reverse(int startIndex, int endIndex, int A[]) {

	        while(startIndex<=endIndex) {

	            int temp = A[startIndex];

	            A[startIndex] = A[endIndex] ;

	            A[endIndex] = temp;

	            startIndex++;

	            endIndex--;

	        }

	    }

	    public static void swap(int startIndex, int endIndex, int A[]){

	            int temp = A[startIndex];

	            A[startIndex] = A[endIndex] ;

	            A[endIndex] = temp;

	    }
	    
	    public static void main (String args[]) {
	    	int arr[] = {1, 2, 3, 4};
	    	int a[] = nextPermutation(arr);
	    	
	    	for(int i: a ) {
	    	  	System.out.print(i);
	    	}
	  
	    }

}
