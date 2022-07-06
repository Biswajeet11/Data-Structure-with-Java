/*
 * 
 * 
 Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1,
 compute how much water it is able to trap after raining.

Input Format
First and only argument is the vector A



Output Format
Return one integer, the answer to the question



Example Input
Input 1:

A = [0, 1, 0, 2]
Input 2:

A = [1, 2]


Example Output
Output 1:

1
Output 2:

0


Example Explanation
Explanation 1:

1 unit is trapped on top of the 3rd element.
Explanation 2:

No water is trapped.*/
public class RainWaterTapping {
	
  public static int trap(final int[] A) {
        
        int maxLeftArr[] = new int[A.length];
        int maxRightArr[] = new int[A.length];
        maxLeftArr[0] = A[0];
        maxRightArr[A.length-1] = A[A.length-1];
        int height=0;
        int totalWater=0;

        for(int i= 1; i<A.length; i++){
            maxLeftArr[i] = Math.max(A[i],maxLeftArr[i-1]);
        }
        
         for(int i= A.length-2; i>0; i--){
             maxRightArr[i] = Math.max(A[i],maxRightArr[i+1]);
        }
        
        for(int i=1;i<A.length-1;i++){
            height = Math.min(maxLeftArr[i],maxRightArr[i])-A[i];
            totalWater += height>0?height:0;
        }
        return totalWater;
        
    }
	
	public static void main (String args[]) {
		int arr[]= {0, 1, 0, 2};
		int val = trap(arr);
		System.out.print(val);
	}

}
