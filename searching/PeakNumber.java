/*
 * Given an array of integers A, find and return the peak element in it. An array element is peak if it is NOT smaller than its neighbors.

For corner elements, we need to consider only one neighbor. We ensure that answer will be unique.

NOTE: Users are expected to solve this in O(log(N)) time.



Example Input
Input 1:

A = [1, 2, 3, 4, 5]
Input 2:

A = [5, 17, 100, 11]


Example Output
Output 1:

 5
Output 2:

 100


Example Explanation
Explanation 1:

 5 is the peak.
Explanation 2:

 100 is the peak.*/

public class PeakNumber {
	
	 public static  int getPeakNumber(int[] A) {
        int n = A.length;
        
        //base cases
        if(n==1) return A[0];
        if(A[1] <= A[0]) return A[0];
        if(A[n-1]>=A[n-2]) return A[n-1];
        
        int low = 1 , high = n - 2;
        while(low <= high)
        {
            int mid = (high - low)/2 + low;
            
            if(A[mid] >= A[mid-1] && A[mid] >= A[mid+1]) return A[mid];
            else if(A[mid] >= A[mid-1]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
	 
	 public static void main(String args[]) {
		 int arr []= {5, 17, 100, 11};
		 int val = getPeakNumber(arr);
		 System.out.print(val);
	 }

}
