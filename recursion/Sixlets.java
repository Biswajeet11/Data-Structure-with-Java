/*
 * Given a array of integers A of size N and an integer B.

Return number of non-empty subsequences of A of size B having sum <= 1000.


Output 
Return number of subsequences of A of size B having sum <= 1000.



Example Input
Input 1:

    A = [1, 2, 8]
    B = 2
Input 2:

    A = [5, 17, 1000, 11]
    B = 4


Example Output
Output 1:

3
Output 2:

0


Example Explanation
Explanation 1:

 {1, 2}, {1, 8}, {2, 8}
Explanation 1:

 No valid subsequence
 */

public class Sixlets {
	
	public static int sixlets(int arr[], int sum , int index , int B) {
		
//		  if (sum > 1000) {
//
//	            return 0;
//		  }
//	        if (cnt == 0) {
//	        	 return 1;
//	        }
//	           
//	        if (i == a.length) {
//	            return 0;
//	        }
//	        // Take ith element or leave it.   
//	        return sixlets(a, i + 1, sum, cnt) + sixlets(a, i + 1, sum + a[i], cnt - 1);
	
		if(sum > 1000) {
			return 0;
		}
		
		if(B==0) {
			return 1;
		}
		
		if(index == arr.length) {
			return 0;
		}
		
		return sixlets(arr, sum, index +1, B) + sixlets(arr, sum +arr[index], index +1, B-1);
	}
	
	public static void main (String args[]) {
		
		int arr[] = {1, 2, 8};
		int b = 2;
		int v = sixlets(arr,0,0,2);
		System.out.println(v);
	}

}
