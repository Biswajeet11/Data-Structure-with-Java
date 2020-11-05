/*

Question
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are given a number k.
4. You are required to find and print the k largest elements of array in increasing order.
Input Format
Input is managed for you
Output Format
Print the k largest elements of array in increasing order in separate lines.
Constraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 100
0 < k <= n
Sample Input
13
12
62
22
15
37
99
11
37
98
67
31
84
99
4
Sample Output
84
98
99
99

*/

package priorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElement {

  public static PriorityQueue<Integer> getElements(int arr[], int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for (int i = 0; i < arr.length; i++) {
      if (i < k) {
        pq.add(arr[i]);
      } else if (arr[i] > pq.peek()) {
        pq.remove();
        pq.add(arr[i]);
      }
    }

    return pq;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the kth element");
    int k = sc.nextInt();
    PriorityQueue<Integer> pq = getElements(arr, k);

    while (pq.size() > 0) {
      System.out.println(pq.remove());
    }
  }
}
