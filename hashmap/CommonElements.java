import java.util.ArrayList;
import java.util.HashMap;

/*
 * Given two integer arrays, A and B of size N and M, respectively.
 task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it appears in both arrays.
The result can be in any order.

Example Input
Input 1:

 A = [1, 2, 2, 1]
 B = [2, 3, 1, 2]
Input 2:

 A = [2, 1, 4, 10]
 B = [3, 6, 2, 10, 10]


Example Output
Output 1:

 [1, 2, 2]
Output 2:

 [2, 10]*/


public class CommonElements {
	
	public static ArrayList<Integer> commonValues(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
	     
		int arr1Size = arr1.size();
		int arr2Size = arr2.size();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int i=0;
		int j=0;
		
		int value = 0;
		
		while(i<arr1Size) {
			if(!map.containsKey(arr1.get(i))) {
				map.put(arr1.get(i),1);
			} else {
				int data = map.get(arr1.get(i));
				map.put(arr1.get(i), data+1);
			}
			i++;
		}
		
		while(j<arr2Size) {
			if(map.containsKey(arr2.get(j))) {
				value = map.get(arr2.get(j));
			   if(value>0) {
				list.add(arr2.get(j));
				map.put(arr2.get(j), value-1);
			}
 
		  }
			j++;
		}
		
		return list;
		
	}

	
	public static void main (String args[]) {
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(1);
		ArrayList<Integer> B = new ArrayList<>();
		
		B.add(2);
		B.add(3);
		B.add(1);
		B.add(2);

		ArrayList<Integer> list = commonValues(A,B);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
}
