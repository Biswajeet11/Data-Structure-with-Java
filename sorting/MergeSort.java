import java.util.Scanner;

/*

 Few descriptions about Merge Sort are:

 1. Merge Sort is also an example of Divide and Conquer.
 2. Merging is the process of combining two sorted files to make one bigger sorted file.
 3. Selection is the process of dividing a file into two parts: k smallest elements and n-k largest elements.
    a. Selection splits a list into two lists.
    b. Merging joins two files to make one file.
 4. Merge Sort access the data in sequential manner.
 5. Merge sort is used in sorting a linked list. This is because of following reasons
    a. In Linked list, we can insert an item in the middle in O(1) time and O(1) extra space.
    b. In Merge Sort data access are done mostly sequentially, that's why Linked list is much preferred here.
 
 
Complexities:
 
Worst Case Time Complexity: O(n*log(n))
 Average Case Time Complexity: O(n*log(n))
 Best Case Time Complexity: O(n*log(n))
 Space Complexity: O(n)
 Algorithm:
 1. First create merge(int[] arr, int l , int m, int r) which does following things:
    a. N1 = m-l+1;
    b. N2 = r-m;
    c. Collect all N1 elements in L[]
    d. Collect all N2 elements in R[]
    e. i = j = k = 0;
    f. loop for i < N1 and j < N2, and whenever L[i] <= R[j], put it in arr[k] and vice-versa.
    g. put all the remaining elements in arr[k].
 2. Second create a recursive function mergeSort(int[] arr, int l, int r), which does following things:
    a. every time it will check l < r
    b. mid = (l+r)/2;
    c. call mergeSort(arr, l, mid); && call mergeSort(arr, mid+1, r);
    d. Call merge function in the end, merge(arr, l, mid, r).

*/

public class MergeSort {
  public static int[] mergeSort(int[] arr, int lo, int hi) {
    if (lo == hi) {
      int[] bans = new int[1];
      bans[0] = arr[lo];
      return bans;
    }
    int mid = (lo + hi) / 2;
    int[] lsa = mergeSort(arr, lo, mid);
    int[] rsa = mergeSort(arr, mid + 1, hi);
    int[] ans = mergeTwoSortedArrays(lsa, rsa);
    return ans;
  }

  // used for merging two sorted arrays
  public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
    int i = 0, j = 0, k = 0;
    int[] ans = new int[a.length + b.length];
    while (i < a.length && j < b.length) {
      if (a[i] <= b[j]) {
        ans[k] = a[i];
        i++;
        k++;
      } else {
        ans[k] = b[j];
        j++;
        k++;
      }
    }

    while (i < a.length) {
      ans[k] = a[i];
      k++;
      i++;
    }

    while (j < b.length) {
      ans[k] = b[j];
      k++;
      j++;
    }

    return ans;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 2, 5, 4, 3, 6, 8 };
    int[] sa = mergeSort(arr, 0, arr.length - 1);
    for (int i = 0; i < sa.length; i++) {
      System.out.print(sa[i] + " ");
    }
  }
}
