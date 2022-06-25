/*
 * Given a string A of size N consisting of lowercase alphabets,
 * check if it is possible to make the given string a palindrome by changing exactly one of its character.
 * 
 * 
Input 1:

 A = "abbba"
Input 2:

 A = "adaddb"


Example Output
Output 1:

 "YES"
Output 2:

 "NO"


Example Explanation
Explanation 1:

 We can change the character at index 3(1-based) to any other character. The string will be palindromic.
Explanation 2:

 To make the string palindromic we need to change 2 characters. 
 * 
 * */

public class ClosestPalindrome {
	
	  public static String solve(String A) {
	        int i=0,j=A.length()-1;
	        int count=0;
	        while(i<j){
	            if(A.charAt(i)!=A.charAt(j)){
	                count++;
	            }
	            i++;
	            j--;
	        }
	        if(count==1){
	            return "YES";
	        }
	       if(A.length()%2!=0 && count==0){
	        return "YES";
	       }
	    
	    return "NO";
     	}
	  
	 public static void main (String args[]) {
		String s =  solve("abbba");
		System.out.println(s);
	 }

}




