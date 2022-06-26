
public class Palindrome {
	
	public static int solve(String A) {
        if(A.length()== 0){
            return 1;
        }
        boolean isP = isPalindrome(0, A.length()-1,A);
            if(isP == true){
                return 1;
            }
            else{
                return 0;
            }
    }
    
    public static boolean isPalindrome( int startIndex, int endIndex, String s){
        if(startIndex == endIndex){
            return true;
        }
        if(s.charAt(startIndex)!=s.charAt(endIndex)){
            return false;
        }
        
        return isPalindrome(startIndex+1,endIndex-1,s);
        
    }
    
    public static void main(String args[]) {
    	int val = solve("DAD");
    	System.out.println(val);
    	
    }

}
