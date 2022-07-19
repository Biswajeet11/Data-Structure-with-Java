import java.util.HashMap;

/*
* Given an array of integers A and an integer B, find and return the number of pairs in A whose sum is divisible by B.

Since the answer may be large, return the answer modulo (109 + 7).


Input Format
The first argument given is the integer array A.
The second argument given is the integer B.



Output Format
Return the total number of pairs for which the sum is divisible by B modulo (109 + 7).



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 2
Input 2:

 A = [5, 17, 100, 11]
 B = 28


Example Output
Output 1:

 4
Output 2:

 1


Example Explanation
Explanation 1:

 All pairs which are divisible by 2 are (1,3), (1,5), (2,4), (3,5). 
 So total 4 pairs.*/

public class PairSumDivisible {
	
	 public static int getPairSumDivisible(int[] A, int B) {
	        
	        HashMap<Integer,Integer> map=new HashMap<>();
	        long count= 0;
	        long mod = 1000000000+7;
	        for(int i=0;i<A.length;i++){
	            int rem=A[i]%B;
	            int val=map.getOrDefault(rem,0);
	            map.put(rem,val+1);
	        }
	        
	        for (Integer key : map.keySet()) {
	            long value = (long)map.get(key);
	            if(key == 0){
	                count += value*(value-1)/2 ;
	            }
	            else if(2*key == B){
	                count += value*(value-1)/2;
	            }
	            else{
	                int freq = map.getOrDefault(B-key,0);
	                
	                count += freq*value;
	               
	            }
	        }
	        
	        return (int)((count/2)%mod);
	    }
	
	public static void main (String args[]) {
		int  A [] = {5, 17, 100, 11};
		int  B = 28;
		int val = getPairSumDivisible(A,B);
		
		System.out.print(val);
		
	}

}
