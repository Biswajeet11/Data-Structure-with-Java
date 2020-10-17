import java.util.Scanner;

/*

1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to add the numbers represented by two arrays and print the
arrays.

Input:

5
3
1
0
7
5
6
1
1
1
1
1
1

output:
1
4
2
1
8
6


sum of 2 arrays 

*/

public class SumOfTwoArrays {

  public static int[] getSumOfArrays(int arr1[], int arr2[]) {

    int n1 = arr1.length;
    int n2 = arr2.length;
    int outputArray[] = new int[n1 > n2 ? n1 : n2];
    int carryOutputArray[] = new int[n1 > n2 ? n1 + 1 : n2 + 1];
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int sumIndex = outputArray.length - 1;

    int carry = 0;
    while (sumIndex >= 0) {

      int digit = carry;
      if (i >= 0) {
        digit += arr1[i];
      }
      if (j >= 0) {
        digit += arr2[j];
      }
      carry = digit / 10;
      digit = digit % 10;
      outputArray[sumIndex] = digit;
      sumIndex--;
      i--;
      j--;

    }
    if (carry > 0) {
      carryOutputArray[0] = carry;
      for (int k = 1; k < outputArray.length; k++) {
        carryOutputArray[k] = outputArray[k - 1];
      }
      return carryOutputArray;
    }

    return outputArray;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of Elements of n1");
    int n1 = sc.nextInt();
    System.out.println("Enter the number of Elements of n2");
    int n2 = sc.nextInt();
    int arr1[] = new int[n1];
    int arr2[] = new int[n2];
    System.out.println("Enter Elements of n1");
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = sc.nextInt();
    }
    System.out.println("Enter Elements of n2");

    for (int i = 0; i < arr2.length; i++) {
      arr2[i] = sc.nextInt();
    }

    int sumedArrays[] = getSumOfArrays(arr1, arr2);
    System.out.println("Output  Element array");
    for (int i = 0; i < sumedArrays.length; i++) {
      System.out.println(sumedArrays[i]);

    }

  }

}
