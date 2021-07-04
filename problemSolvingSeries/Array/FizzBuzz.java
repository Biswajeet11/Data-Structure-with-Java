
/*
FizzBuzz
Problem Description

Given a positive integer A, return an array of strings with all the integers from 1 to N. 
But for multiples of 3 the array should have “Fizz” instead of the number. 
For the multiples of 5, the array should have “Buzz” instead of the number. 
For numbers which are multiple of 3 and 5 both, the array should have "FizzBuzz" instead of the number.

Input 1:

 A = 5


Example Output
Output 1:

 [1 2 Fizz 4 Buzz]


*/

import java.util.Scanner;

public class FizzBuzz {
  public String[] fizzBuzz(int A) {
    String arr[] = new String[A];

    for (int i = 1; i <= A; i++) {
      if (i % 15 == 0) {
        arr[i - 1] = "FizzBuzz";
      } else if (i % 3 == 0) {
        arr[i - 1] = "Fizz";
      } else if (i % 5 == 0) {
        arr[i - 1] = "Buzz";
      } else {
        arr[i - 1] = "" + i;
      }
    }
    return arr;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    FizzBuzz fb = new FizzBuzz();
    String values[] = fb.fizzBuzz(number);
    for (int i = 0; i < values.length; i++) {
      System.out.println(values[i]);
    }
  }

}
