/*
Given a column title as appears in an Excel sheet, return its corresponding column number.


Input Format
The only argument is a string that represents the column title in the excel sheet.



Output Format
Return a single integer that represents the corresponding column number.



Example Input
Input 1:

 AB
Input 2:

 ABCD


Example Output
Output 1:

 28
Output 2:

 19010


Example Explanation
Explanation 1:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28*/

public class ExcelSheet {

	
	 public static int titleToNumber(String A) {
	       int result = 0;
    	   
	       for (int i = 0; i < A.length(); i++){
		       result = result * 26 + (A.charAt(i) - 'A' + 1);
		   }
	      
	       return result;
	    }
	 
	 public static void main (String args []) {
		int val = titleToNumber("AB");
		System.out.println(val);
	 }
}
