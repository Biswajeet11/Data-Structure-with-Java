import java.util.HashSet;

/*
 * 
Given an integer array A containing N distinct integers.

Find the number of unique pairs of integers in the array whose XOR is equal to B.

NOTE:

Pair (a, b) and (b, a) is considered to be the same and should be counted once.



Input Format
The first argument is an integer array A.

The second argument is an integer B.



Output Format
Return a single integer denoting the number of unique pairs of integers in the array A whose XOR is equal to B.



Example Input
Input 1:

 A = [5, 4, 10, 15, 7, 6]
 B = 5
Input 2:

 A = [3, 6, 8, 10, 15, 50]
 B = 5


Example Output
Output 1:

 1
Output 2:

 2


Example Explanation
Explanation 1:

 (10 ^ 15) = 5
Explanation 2:

 (3 ^ 6) = 5 and (10 ^ 15) = 5 */



public class PairWithXor {
	
	public static int pairs(int [] arr, int b) {
		
		HashSet<Integer> set = new HashSet<>();
		
		int count = 0;
		
		for(int i= 0;i<arr.length;i++){
            int val = arr[i]^b;
            if(!set.contains(val)){
                set.add(arr[i]);
            }
            else{
                count++;
            }
        }
        return count;

	}
	
	public static void main(String args[]) {
		
		 int A [] = {3, 6, 8, 10, 15, 50};
         int B = 5;
		
		int count = pairs(A,B);
		
		System.out.print("count "+count);
		
	}

}
