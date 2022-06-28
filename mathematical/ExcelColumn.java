/*Given a positive integer A, return its corresponding column title as it appears in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 


Input Format
First and only argument of input contains single integer A



Output Format
Return a string denoting the corresponding title.



Example Input
Input 1:

A = 3
Input 2:

 
A = 27


Example Output
Output 1:

"C"
Output 2:

"AA"


Example Explanation
Explanation 1:

 
3 corrseponds to C.
Explanation 2:

    1 -> A,
    2 -> B,
    3 -> C,
    ...
    26 -> Z,
    27 -> AA,
    28 -> AB */


public class ExcelColumn {
	
	 public static String convertToTitle(int A) {
	      StringBuilder str = new StringBuilder();
	        while(A!=0){
	            char ch= (char)((A-1)%26+65);
	            A=(A-1)/26;
	            str.append(ch);
	        }
	        return str.reverse().toString();
	    }
	 
	 public static void main(String args[]) {
		String a = convertToTitle(28);
		System.out.print(a);
	 }

}
