import java.util.ArrayList;
import java.util.HashMap;

/*
 * 
Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single element "-1".

First sub-array means the sub-array for which starting index in minimum.


Input Format
The first argument given is the integer array A.

The second argument given is integer B.


Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 5
Input 2:

 A = [5, 10, 20, 100, 105]
 B = 110


Example Output
Output 1:

 [2, 3]

Output 2:

 -1
 */
public class SubArrayWithGivenSum {
	
	
	public static ArrayList<Integer> subArraySum(ArrayList<Integer> A, int B) {
		
        HashMap<Long,Integer> map = new HashMap<>();
        
        ArrayList<Integer> list = new ArrayList<>();

        long sum = 0;
        int firstIndex = 0;
        int lastIndex= -1;


        for(int i=0;i<A.size();i++) {
            sum += A.get(i);

            if(map.containsKey(sum-B)){
                firstIndex = map.get(sum-B);
                lastIndex = i;
                break;
            }
            else {
                map.put(sum,i);
            }
        }

        if(lastIndex<0){
            list.add(-1);
        }

        for(int i = firstIndex+1; i<=lastIndex; i++) {
            list.add(A.get(i));
        }

        return list;
    }
	
	
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		int B = 5; 
		ArrayList<Integer> sumArr = subArraySum(arr, B);
		for(int i=0;i<sumArr.size();i++) {
			System.out.println(sumArr.get(i));
		}
	}

}
