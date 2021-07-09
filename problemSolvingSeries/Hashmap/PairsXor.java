import java.util.HashSet;

/*

Given an 1D integer array A containing N distinct integers.

Find the number of unique pairs of integers in the array whose XOR is equal to B.

NOTE:

Pair (a, b) and (b, a) is considered to be same and should be counted once.

*/
public class PairsXor {
  public int countPairXor(int[] A, int B) {
    HashSet<Integer> set = new HashSet<Integer>();
    int count = 0;
    for (int i = 0; i < A.length; i++) {
      int value = A[i] ^ B;

      if (!set.contains(value)) {
        set.add(A[i]);
      } else {
        count++;
      }

    }
    return count;
  }

  public static void main(String[] args) {
    PairsXor px = new PairsXor();
    int A[] = { 5, 4, 10, 15, 7, 6 };
    int B = 5;
    int val = px.countPairXor(A, B);
    System.out.println(val);
  }
}
