/*
1. You are given two sorted arrays(a,b) of integers.
2. You have to merge them and form one sorted array.
3. You have to do it in linear time complexity.

Sample Input
4
-2 
5 
9 
11
3
4 
6 
8

Sample Output
-2
4
5
6
8
9
11

*/

import java.util.Scanner;

public class MergeTwoSortedArray {

  public static int[] mergedSortedArray(int arr1[], int arr2[]) {
    int output[] = new int[arr1.length + arr2.length];
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        output[k] = arr1[i];
        i++;
      } else {
        output[k] = arr2[j];
        j++;
      }

      k++;
    }

    while (i < arr1.length) {
      output[k] = arr1[i];
      k++;
      i++;
    }

    while (j < arr2.length) {
      output[k] = arr2[j];
      k++;
      j++;
    }

    return output;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    int arr1[] = new int[n1];
    int arr2[] = new int[n2];
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = sc.nextInt();
    }
    for (int i = 0; i < arr2.length; i++) {
      arr2[i] = sc.nextInt();
    }
    int output[] = mergedSortedArray(arr1, arr2);
    for (int i = 0; i < output.length; i++) {
      System.out.print(output[i]+" ");
    }
  }
}
