import java.util.Scanner;

/*

check if array of numbers are prime ?


*/
// int count = 0;
//     for (int i = 0; i < arr.length; i++) {
//       int n = sc.nextInt();
//       for (int divide = 2; divide * divide <= n; divide++) {
//         if (n % divide == 0) {
//           count++;
//           break;
//         }
//       }
//     }
//     if (count == 0) {
//       System.out.println("Prime Number");
//     } else {
//       System.out.println("Not A Prime Number");
//     }
//   }

public class IsPrime {

  public static String[] checkPrime(int arr[]) {
    int count = 0;
    String outputArr[] = new String[arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int divide = 2; divide * divide < arr[i]; divide++) {
        if (arr[i] % divide == 0) {
          count++;
          break;
        }
      }
      if (count == 0) {
        outputArr[i] = "Prime";
      } else {
        outputArr[i] = "Not A Prime Number";
      }
    }
    return outputArr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of elements you want in array:");
    int length = sc.nextInt();
    int arr[] = new int[length];

    for (int i = 0; i < length; i++) {
      arr[i] = sc.nextInt();
    }
    String[] outputArray = checkPrime(arr);

    for (int i = 0; i < outputArray.length; i++) {
      System.out.println(outputArray[i]);
    }
  }
}
