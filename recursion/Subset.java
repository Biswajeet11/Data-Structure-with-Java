import java.util.Arrays;

/*Given a set of distinct integers A, return all possible subsets.

NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
Also, the subsets should be sorted in ascending ( lexicographic ) order.
The list is not necessarily sorted.


Example Input
Input 1:

A = [1]
Input 2:

A = [1, 2, 3]


Example Output
Output 1:

[
    []
    [1]
]
Output 2:

[
 []
 [1]
 [1, 2]
 [1, 2, 3]
 [1, 3]
 [2]
 [2, 3]
 [3]
]

*/

public class Subset {
	
	public static int [][] getSubset(int arr[]) {
		Arrays.sort(arr);
		return getSubsetHelper(arr,0);
	}
	
	public static int[][] getSubsetHelper(int[] input, int startIndex) {
		
		if(startIndex == input.length){
		    int arr[][] = new int[1][0];
		    return arr;
        }
        
      int smallAns[][] = getSubsetHelper(input,startIndex+1);
      
      int ans[][]=new int[2*smallAns.length][];
      int k = 1;
      ans[0] = new int[0];
     
      
      for(int i=0;i<smallAns.length;i++){
          ans[k] = new int[smallAns[i].length+1];
          ans[k][0] = input[startIndex];
         for(int j=1;j<=smallAns[i].length;j++){
           ans[k][j] = smallAns[i][j-1];   
         }
         k++;
      }
      
       for(int i=1;i<smallAns.length;i++){
          ans[k] = new int[smallAns[i].length];
         for(int j=0;j<smallAns[i].length;j++){
          ans[k][j] = smallAns[i][j];   
         }
         k++;
      }
      return ans;
	}
	
	
	public static void main (String args[]) {
		int A[] = {1, 2, 3};
		int arr[][] = getSubset(A);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				  System.out.print(arr[i][j]);	
			}
			  System.out.println(" ");	
		 
		}
	}

}
