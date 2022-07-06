/*
 * 
Input:[3 1 2 5 3] 

Output:[3, 4] 

A = 3, B = 4
*/
public class RepeatMissingArray {
	
	 public static int[] repeatedNumber(final int[] A) {
	        int arr[] = new int[2];
	        long n = (long) A.length;
	        
	        long missingNumber = 0;
	        long sum = n*(n+1)/2; 
	        long squareSum = ((n)*(n+1)*(2*(n)+1))/6 ;
	        long repeating = 0;
	        long sum1 = 0;
	        long squareSum2 = 0;
	        long diff=0;
	        long squareSumDiff=0;
	        
	        for(int i=0;i<A.length;i++){
	            sum1 += A[i];
	            squareSum2 += (long) A[i]*A[i];
	        }
	        
	        diff = sum-sum1;
	        squareSumDiff = (squareSum - squareSum2);
	        
	        missingNumber = (diff+(squareSumDiff/diff))/2;
	        repeating = missingNumber - diff;
	        arr[0] = (int)repeating;
	        arr[1] = (int)missingNumber;
	        
	        return arr;
	        
	    }
	 
	 public static void main (String args[]) {
		 int arr[] = {3, 1, 2, 5, 3};
		 int a[] =  repeatedNumber(arr);
		 
		 for(int i: a) {
			 System.out.println(i);
		 }
	 }
}
