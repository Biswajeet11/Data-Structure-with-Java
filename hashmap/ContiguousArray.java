import java.util.HashMap;

/*
 * 
Given an array of integers A consisting of only 0 and 1.

Find the maximum length of a contiguous subarray with equal number of 0 and 1.



Input Format

The only argument given is the integer array A.
Output Format

Return the maximum length of a contiguous subarray with equal number of 0 and 1.


Input 1:
    A = [1, 0, 1, 0, 1]
Output 1:
    4
    Explanation 1:
        Subarray from index 0 to index 3 : [1, 0, 1, 0]
        Subarray from index 1 to index 4 : [0, 1, 0, 1]
        Both the subarrays have equal number of ones and equal number of zeroes.

Input 2:
    A = [1, 1, 1, 0]
Output 2:
    2
 * */




public class ContiguousArray {
	
	
	public static int arrayCount(int arr[]) {
		
		
		int sum =0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				arr[i]=-1;
			}
		}
		
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0, -1);
		
		int res = 0;
		
		for(int i=0;i<arr.length;i++) {
			 sum += arr[i];
			 
			 if(!map.containsKey(sum)) {
				 map.put(sum, i);
			 } else {
				int index = map.get(sum);
				res = Math.max(i, res-index);
			 }
		}
		return res;
	}
	
	
	public static void main(String args[]) {
		 int A [] = {1, 0, 1, 0, 1};
		int count = arrayCount(A);
		
		System.out.println("count"+count);
		
	}

}
