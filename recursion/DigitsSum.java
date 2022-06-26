
public class DigitsSum {

    public static int solve(int A) {
        if (A == 0) {
             return 0; 
        }
           
        return (A % 10 + solve(A / 10)); 
    }
    
    public static void main(String args[]) {
    	int val = solve(127);
    	System.out.print(val);
    }
    
}
