/*
 * Given an array A of N integers, find the index of values that satisfy P + Q = R + S, 
 * where P, Q, R & S are integers values in the array

Expected time complexity O(N2)

NOTE:

1) Return the indices `A1 B1 C1 D1`, so that 
  A[A1] + A[B1] = A[C1] + A[D1]
  A1 < B1, C1 < D1
  A1 < C1, B1 != D1, B1 != C1 

2) If there are more than one solutions, 
   then return the tuple of values which are lexicographical smallest. 

Assume we have two solutions
S1 : A1 B1 C1 D1 ( these are values of indices in the array )  
S2 : A2 B2 C2 D2

S1 is lexicographically smaller than S2 if:
  A1 < A2 OR
  A1 = A2 AND B1 < B2 OR
  A1 = A2 AND B1 = B2 AND C1 < C2 OR 
  A1 = A2 AND B1 = B2 AND C1 = C2 AND D1 < D2
If no solution is possible, return an empty list.




Input Format
First and only argument is an integer array A of length N.



Output Format
Return an array of size four which contains indices of values P, Q, R, and S.



Example Input
Input 1:

 A = [3, 4, 7, 1, 2, 9, 8]
Input 2:

 A = [2, 5, 1, 6]


Example Output
Output 1:

 [0, 2, 3, 5]
Output 2:

 [0, 1, 2, 3]


Example Explanation
Explanation 1:

 A[0] + A[2] = A[3] + A[5]
 Note: indexes returned should be 0-based.
Explanation 2:

 A[0] + A[1] = A[2] + A[3]
*/



import java.util.ArrayList;
import java.util.HashMap;

public class EqualHashmap {
	
	 public static int[] equal(int[] A) {
		 
	        HashMap<Integer,ArrayList<Integer>> hmap=new HashMap<>();
	        int[] res=new int[4];
	        res[0]=Integer.MAX_VALUE;
	        res[1]=Integer.MAX_VALUE;
	        res[2]=Integer.MAX_VALUE;
	        res[3]=Integer.MAX_VALUE;
	        for(int i=0;i<A.length-1;i++){
	            for(int j=i+1;j<A.length;j++){
	                int sum=A[i]+A[j];
	                if(hmap.containsKey(sum)){
	                    int idash=hmap.get(sum).get(0);
	                    int jdash=hmap.get(sum).get(1);
	                    if(i==idash||j==idash||j==jdash||i==jdash){
	                        continue;
	                    }else{
	                        if(res[0]>idash){
	                            res[0]=idash;
	                            res[1]=jdash;
	                            res[2]=i;
	                            res[3]=j;
	                        }else if(res[0]==idash&&res[1]>jdash){
	                            res[0]=idash;
	                            res[1]=jdash;
	                            res[2]=i;
	                            res[3]=j;
	                        }else if(res[0]==idash&&res[1]==jdash&&res[2]>i){
	                            res[0]=idash;
	                            res[1]=jdash;
	                            res[2]=i;
	                            res[3]=j;
	                        }else if(res[0]==idash&&res[1]==jdash&&res[2]==i&&res[3]>j){
	                            res[0]=idash;
	                            res[1]=jdash;
	                            res[2]=i;
	                            res[3]=j;
	                        }
	                        
	                    }
	                }else{
	                    ArrayList<Integer> arr=new ArrayList<>();
	                    arr.add(i);
	                    arr.add(j);
	                    hmap.put(sum,arr);
	                }
	            }
	        }
	        return res;
	    }
	 
	 public static void main(String args[]) {
		 int [] A = {3, 4, 7, 1, 2, 9, 8};
		 int arr[] = equal(A);
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		
	 }
}
