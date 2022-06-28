/*Input 1

 A = 5
Input 2:

 A = 6


Example Output
Output 1:

 1
Output 2:

 1


Example Explanation
Explanation 1:

 A! = 120.
 Number of trailing zeros = 1. So, return 1.
Explanation 2:

 A! = 720 
 Number of trailing zeros = 1. So, return 1.
*/
public class TrailingZero {
	
	 public static  int trailingZeroes(int A) {
	        int count=0;
	        int division=5;
	        while(A>=division){
	            count+= (A/division);
	            division*= 5;
	        }
	        return count;
	    }
	 
	 public static void main(String args[]) {
		 int val = trailingZeroes(5);
		 System.out.print(val);
	 }

}
