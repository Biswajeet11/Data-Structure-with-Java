/*
 * Input
    ABEC

Output
    6

Explanation
    Amazing substrings of given string are :
    1. A
    2. AB
    3. ABE
    4. ABEC
    5. E
    6. EC
    here number of substrings are 6 .*/


public class AmazingStrings {
	
	 public static int solve(String A) {
	        int ans=0;
	        char ch[]=A.toCharArray();
	        
	     for(int i=0;i<ch.length;i++){
	        if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' ||
	         ch[i]=='u' || ch[i]=='o' || ch[i]=='i' || ch[i]=='e' || ch[i]=='a'  ){
	            ans+=(A.length())-i;
	        }
	        if(ans>10003){
	            ans=ans%10003;
	        } 
	       }
	        return ans;
	    }
	 
	 public static void main (String args[]) {
		 
		 String s = "ABEC";
		 
		 int val = solve(s);
		 System.out.print(val);
		 
	 }

}
