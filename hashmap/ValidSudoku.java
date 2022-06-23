import java.util.HashSet;

/*
 * The input corresponding to the above configuration :

["53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"]
A partially filled sudoku which is valid.

Note:

A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
Return 0 / 1 ( 0 for false, 1 for true ) for this problem
*/


public class ValidSudoku {

	public static boolean isValidSudoku(String[] A) {
		  HashSet<String> hasSeen=new HashSet<>();
	        int row = A.length;
	        int col = A[0].length();
	        char[][] board=new char[9][9];
	        
	        for(int r=0; r<9; r++){
	            String str=A[r];
	            for( int c=0; c<9; c++){
	                board[r][c]=str.charAt(c);
	            }
	        }
	        
	        for(int i=0;i<9;i++){
	            for(int j=0;j<9;j++){
	                if(board[i][j]!='.'){
	                 if(!hasSeen.add("row"+i+board[i][j]) || !hasSeen.add("column"+j+board[i][j])
	                 || !hasSeen.add("subbox"+"row"+i/3+"column"+j/3+board[i][j]) ){
	                    return false;
	                  }   
	                }
	                
	            }
	        }
	        return true;
	    }
	
	public static void main(String args[]) {
		String A[] = {"53..7....", "6..195...", ".98....6.", "8...6...3",
				      "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
		boolean isValid = isValidSudoku(A);
		System.out.print(isValid);
	}
}
