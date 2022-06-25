import java.util.Arrays;
import java.util.Comparator;

/*
 * 
 * 
Given an array A of non-negative integers, arrange them such that they form the largest number.

Example Input
Input 1:

 A = [3, 30, 34, 5, 9]
Input 2:

 A = [2, 3, 9, 0]


Example Output
Output 1:

 "9534330"
Output 2:

 "9320"
 */
public class LargestNumber {

	 public static String largestNumber(final int[] A) {
		 
	        int n = A.length;
	        
	        String arr[] = new String[n];

	        for(int i=0;i<arr.length;i++){
	            arr[i] = String.valueOf(A[i]);
	        }

	        Arrays.sort(arr, new Comparator<String>(){
	            public int compare(String num1, String num2){
	                return (num2+num1).compareTo(num1+num2);
	            }
	        });

	        StringBuilder sb = new StringBuilder();

	        for(int i=0;i<arr.length;i++){
	            sb.append(arr[i]);
	        }

	        while(sb.charAt(0) == '0' && sb.length()>1){
	            sb.deleteCharAt(0);
	        }

	     return sb.toString();


	    }
	 
	 public static void main (String args[]) {
		 int A [] = {3, 30, 34, 5, 9};
		 String val = largestNumber(A);
		 System.out.print(val);
	 }
}
