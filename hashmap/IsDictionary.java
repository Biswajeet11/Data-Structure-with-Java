/*
 *In an alien language, they also use English lowercase letters, but possibly in a different order. 
 *The order of the alphabet is some permutation of lowercase letters.

Given an array of words A of size N written in the alien language, 
and the order of the alphabet denoted by string B of size 26, 
return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.



Problem Constraints
1 <= N, length of each word <= 105

Sum of the length of all words <= 2 * 106



Input Format
The first argument is a string array A of size N.

The second argument is a string B of size 26, denoting the order.



Output Format
Return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.*/


import java.util.ArrayList;
import java.util.HashMap;

public class IsDictionary {

	 public static int solve(ArrayList<String> A, String B) {

	        HashMap<Character,Integer> map = new HashMap<>();

	        for(int i=0;i<B.length();i++){
	            map.put(B.charAt(i),i);
	        }

	        for(int i=0; i<A.size()-1; i++) {
	           if(isDictionaryCompare(A.get(i),A.get(i+1),map)==false){
	               return 0;
	           }
	        }

	        return 1;

	    }

	    public static boolean isDictionaryCompare(String str1, String str2, HashMap<Character,Integer> map) {

	        for(int i=0, j=0; i<str1.length() && j< str2.length(); i++, j++) {

	            if(str1.charAt(i)!=str2.charAt(j)) {
	                if(map.get(str1.charAt(i)) > map.get(str2.charAt(j))){
	                    return false;
	                }
	                else {
	                    return true;
	                }
	            }
	        }
	        
	        if(str1.length()>str2.length()) {
	            return false;
	        }
	        return true;

	    }
	    
	    public static void main (String args[]) {
	    	ArrayList<String> A = new ArrayList<>();
	    	String B = "qwertyuiopasdfghjklzxcvbnm";
	    	A.add("fine");
	    	A.add("none");
	    	A.add("no");
	    	int val = solve(A,B);
	    	System.out.print("val "+val);
	    }
}
