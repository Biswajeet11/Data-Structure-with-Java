import java.util.Arrays;

/*
 * 
Given an array of integers A, find and return the minimum value of | A [ i ] - A [ j ] |
where i != j and |x| denotes the absolute value of x.


Input Format
The only argument given is the integer array A.



Output Format
Return the minimum value of | A[i] - A[j] |.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [5, 17, 100, 11]


Example Output
Output 1:

 1
Output 2:

 6


Example Explanation
Explanation 1:

 The absolute difference between any two adjacent elements is 1, which is the minimum value.
Explanation 2:

 The minimum value is 6 (|11 - 5| or |17 - 11|).
 * */
public class MinimumAbsoluteDifference {
	
	public static int diff(int arr[]) {
		int i = 0;
		int k = 1;
		int n = arr.length;
		Arrays.sort(arr);
		int MIN_VALUE = Integer.MAX_VALUE;
		
		while(k<n) {
			int val = Math.abs(arr[k]-arr[i]);
			if(Math.abs(arr[k]-arr[i])<MIN_VALUE) {
				MIN_VALUE = val;
			}
			i++;
			k++;
		}
		return MIN_VALUE;
	}
	
	public static void main(String args[]) {
		
		int arr[] = {5, 17, 100, 11};
		int val = diff(arr);
		System.out.print(val);
		
		
	}

}
