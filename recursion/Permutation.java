import java.util.ArrayList;

/*
 * Given an integer array A of size N denoting collection of numbers , return all possible permutations.

Example Input
A = [1, 2, 3]


Example Output
[ [1, 2, 3]
  [1, 3, 2]
  [2, 1, 3] 
  [2, 3, 1] 
  [3, 1, 2] 
  [3, 2, 1] ]


Example Explanation
All the possible permutation of array [1, 2, 3].*/

public class Permutation {
	
	ArrayList<ArrayList<Integer>> list;
	

	public  ArrayList<ArrayList<Integer>> getPermutation(ArrayList<Integer>arr) {
		 list = new ArrayList<>();
		 getPermutationHelper(0,arr.size()-1,arr);
		 return list;
	}
	
	public  void getPermutationHelper(int l, int r, ArrayList<Integer>arr) {
		if(l>r) {
			return;
		}
		
		if(l == r) {
			ArrayList<Integer> a = new ArrayList<>(arr);
			list.add(a);
		}
		
		for(int i=l; i<=r; i++) {
			swap(l,i,arr);
			getPermutationHelper(l+1,r,arr);
			swap(l,i,arr);
		}
	}
	
	public  ArrayList<Integer> swap(int startIndex, int endIndex, ArrayList<Integer>arr) {
		int temp = arr.get(startIndex);
		arr.set(startIndex, arr.get(endIndex));
		arr.set(endIndex,temp);
		return arr;
	}
	
	public static void main (String args []) {
		Permutation p = new Permutation();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		ArrayList<ArrayList<Integer>> a =  p.getPermutation(list);
		
		for(ArrayList<Integer> i: a ) {
			System.out.print(i);
		}
	}
}
