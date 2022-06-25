/*
 * 
 * Input 1 :
    A = [0 1 2 0 1 2]
   
   Input 2:

    A = [0]


 Example Output
  Output 1:
    [0 0 1 1 2 2]
  
  Output 2:

    [0]
    
    */
public class SortByColor {

	 public static int[] sortColors(int[] A) {
	        int n = A.length;
	        int low = 0, mid = 0, high = n-1, temp = 0;

	        while(mid<=high) {

	            switch (A[mid]) {
	              case 0:
	                temp = A[low];
	                A[low] = A[mid];
	                A[mid] = temp;
	                mid++;
	                low++;
	                break;
	            
	            case 1:
	                mid++;
	                break;

	            case 2:
	               temp = A[high];
	               A[high] = A[mid];
	               A[mid] = temp;
	               high --;
	               break;    
	         }
	        }
	        return A;

	    }
	 
	 public static void main(String args[]) {
		 int arr[]= {0,0,1,1, 2, 2};
		 int arrNew [] = sortColors(arr);
		 
		 for(int i=0;i<arrNew.length;i++) {
			 System.out.println(arr[i]);
		 }
	
	 }
}
