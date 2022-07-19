
public class GreatestCommonDivisor {
	
	 public static  int gcd(int A, int B) {
	       if(A==0){
	           return B;
	       }
	       if(B==0){
	           return A;
	       }
	       if(A==B){
	           return A;
	       }
	       if(A>B){
	           return gcd(A-B,B);
	       }
	       return gcd(A,B-A);
	    }
	 
	 
	 public static void main (String args[]) {
		int A = 4;
		int	B = 6;
		
		int val = gcd(A,B);
		System.out.print(val);
	 }

}
