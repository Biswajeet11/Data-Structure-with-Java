/*
 Given a string A. Find the rank of the string amongst its permutations sorted lexicographically.
Assume that no characters are repeated.

Example Input
Input 1:

A = "acb"
Input 2:

A = "a"


Example Output
Output 1:

2
Output 2:

1


Example Explanation
Explanation 1:

Given A = "acb".
The order permutations with letters 'a', 'c', and 'b' : 
abc
acb
bac
bca
cab
cba
So, the rank of A is 2.
Explanation 2:

Given A = "a".
Rank is clearly 1.
 * */
public class SortedPermutationRank {
	
    // https://www.youtube.com/watch?v=uUN8fVPrJn0
    public static int findRank(String A) {
        int mod= 1000003;
        int len = A.length();
        long fact[] = new long[1000];
        int ascii[]=new int[256];
        int output=0;
        
        fact[0]=1;
        fact[1]=1;
        
        for(int i=2;i<1000;i++){
            fact[i]=(i*fact[i-1])%mod;
        }
        
        for(int i=0;i<len;i++){
            int ch=A.charAt(i);
            ascii[ch]=1;
        }
        
       
        for(int i=0;i<len;i++){
          int numberOfLettersSmaller=0;
            for(int j=0;j<256;j++){
                int chVal=A.charAt(i);
                if(j == chVal){
                    break;
                }
                if(ascii[j]==1){
                numberOfLettersSmaller++;
               }
            }
            int ch=A.charAt(i);
            ascii[ch]= 0;
            output = (output+ numberOfLettersSmaller*(int)fact[len-i-1])%mod;
        }
        return output+1;
    }
    
    public static void main(String[] args) {
    	
    	int v = findRank("acb");
    	System.out.print(v);
    }

}
