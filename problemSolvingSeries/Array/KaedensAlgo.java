 // https://www.youtube.com/watch?v=K7ZqYyu7_VE
/*
 * 
 * Max Sum Contiguous Subarray or kaeden's alo
 * */
public class KaedensAlgo {
	

    public static int maxSubArray(final int[] A) {
         int n = A.length;
        
        int maxend = 0, maxsofar = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
           
            maxend = maxend + A[i];
            
            if(maxend < A[i])
                maxend = A[i];
                
            if(maxsofar < maxend)
                maxsofar = maxend;
        }
        
        return maxsofar;
    }
    
    public static void main (String args[]) {
    	int  A [] = {1, 2, 3, 4, -10}; 
    	int val = maxSubArray(A);
    	System.out.print(val);
}


}
