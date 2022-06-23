import java.util.HashSet;

/*
 * Given an array of integers A, find and return whether the given array 
 contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return true, else return false.
*/


public class SubArrayWithZeroSum {
	
	public static boolean isSubArrayWithZeroSum(int arr[]) {
		boolean flag = false;
		int sum = 0;
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(0);
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			if(set.contains(sum)) {
				flag = true;
				break;
			} else {
				set.add(sum);
			}
		}
		
		return flag;
	}
	
	public static void main(String args[]) {
		int arr[] = {1,2-3};
		boolean flag = isSubArrayWithZeroSum(arr);
		
		System.out.print(flag);
	}

}
