/*
 * 
 * Find the number of occurrences of bob in string A consisting of lowercase English alphabets.
 * */
public class CountOccurence {
	 public static int solve(String A) {
	        int count=0;
	        int index=0;
	       while(index<A.length()){
	           if(A.toLowerCase().indexOf("bob",index) != -1){
	            index=A.toLowerCase().indexOf("bob",index)+1;
	            count++;
	        }  
	        else{
	            break;
	        }
	     }
	        return count;
	    }
	 
	 public static void main(String args[]) {
		int val =  solve("bobob");
		System.out.print(val);
	 }
	 
}
