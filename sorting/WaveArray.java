import java.util.Arrays;

/*
 * 
Given an array of integers A, sort the array into a wave-like array and return it.

In other words, arrange the elements into a sequence such that

a1 >= a2 <= a3 >= a4 <= a5..... 

*Input 1:

A = [1, 2, 3, 4]
Input 2:

A = [1, 2]


Example Output
Output 1:

[2, 1, 4, 3]
Output 2:

[2, 1]
*/
public class WaveArray {
	
	  public static int [] swap (int startIndex,int endIndex,int [] arr){
	        int temp = arr[startIndex];
	         arr[startIndex] = arr[endIndex];
	         arr[endIndex] = temp;
	        return arr;
	    }
	    public static  int[] wave(int[] A) {
	        Arrays.sort(A);
	        for(int i=0;i<A.length-1;i+=2){
	            swap(i,i+1,A);
	        }
	        return A;
	    }
	    
	    public static void main(String args[]) {
	    	int [] A = {1, 2, 3, 4};
	    	int arr [] = wave(A);
	    	for(int i=0;i<arr.length;i++) {
	    		System.out.println(arr[i]);
	    	}
	    }

}
