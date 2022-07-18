/*
 * 
 * You are given an integer array A of size N.

You have to pick B elements in total. Some (possibly 0) elements from left end of array A and some (possibly 0) from the right end of array A to get the maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4, and array A contains 10 elements, then

You can pick the first four elements or can pick the last four elements, or can pick 1 from front and 3 from the back, etc. You need to return the maximum possible sum of elements you can pick.


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

 Pick element 2 from end as this is the maximum we can get
 * 
 * 
 * */
public class PickFromBothSides {
	
	
	public static int getMaxFromBothSide(int arr[], int B) {
		int sum1 = 0;
		int sum2 = 0;
		int n = arr.length;
		int ith = arr.length-B;
		
		
		for(int i=0;i<n;i++) {
			sum1 += arr[i];
		}
		
		for(int i=0;i<ith;i++) {
			sum2 += arr[i];
		}
		
		int min = sum2;
		int k=ith;
		int i=1;
		
		while (k<n) {
			sum2 += arr[k] - arr[i-1];
			min = Math.min(sum2,min);
			k++;
			i++;
		}
		
		return sum1-min;

	}
	
	
	public static void main (String args[]) {
		
		int arr [] =  {5, -2, 3 , 1, 2};
		int B= 3;
		
		int val = getMaxFromBothSide(arr,B);
		
		System.out.print(val);
		
	}
}
