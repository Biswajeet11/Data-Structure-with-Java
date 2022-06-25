/*
 * 
You are given two strings, A and B, of size N and M, respectively.

You have to find the count of all permutations of A present in B as a substring. 
You can assume a string will have only lowercase letters.



Input Format
Given two arguments, A and B of type String.


Output Format
Return a single integer, i.e., number of permutations of A present in B as a substring.



Example Input
Input 1:

 A = "abc"
 B = "abcbacabc"
Input 2:

 A = "aca"
 B = "acaa"


Example Output
Output 1:

 5
Output 2:

 2


Example Explanation
Explanation 1:

 Permutations of A that are present in B as substring are:
    1. abc
    2. cba
    3. bac
    4. cab
    5. abc
    So ans is 5.
Explanation 2:

 Permutations of A that are present in B as substring are:
    1. aca
    2. caa 
 * */
public class PermutationOfAInB {
	
	public static int permute(String A, String B) {
		
		  int aLength = A.length();
	        int bLength = B.length();

	        int count = 0;

	        int freq1 [] = new int[26];
	        int freq2 [] = new int[26]; 

	        for(int i=0;i<aLength;i++){
	            freq1[A.charAt(i)-'a'] += 1;
	        }

	        for(int i=0;i<aLength;i++){
	            freq2[B.charAt(i)-'a'] += 1;
	        }

	        count += hasSame(freq1,freq2);

	        for(int i= aLength, j=0; i<bLength; i++,j++) {
	            freq2[B.charAt(j)-'a'] -=1;
	            freq2[B.charAt(i)-'a'] +=1;
	            count += hasSame(freq1,freq2);
	        }

	        return count;

	    }
	
	  public static int hasSame(int freq1[], int freq2[]) {
	        for(int i=0;i<26;i++) {
	            if(freq1[i]!=freq2[i]) {
	                return 0;
	            }
	        }
	        return 1;
	    }
	
	
	public static void main(String args[]) {
		String  A = "abc";
		String	B = "abcbacabc";
		int count = permute(A,B);
		System.out.println("count"+count);
	}

}
