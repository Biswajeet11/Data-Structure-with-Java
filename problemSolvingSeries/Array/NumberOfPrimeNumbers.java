/*

Return the # of prime numbers in an array


Input :

[-6,2, 4, 5, 11]



Output : 

3

*/

public class NumberOfPrimeNumbers {

  public boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public int countNumberOfPrime(int[] A) {
    int countPrime = 0;
    for (int i = 0; i < A.length; i++) {
      boolean count = isPrime(A[i]);
      if (count == true) {
        countPrime++;
      }
    }

    return countPrime;
  }

  public static void main(String[] args) {
    int arr[] = { -6, 2, 4, 5, 11 };
    NumberOfPrimeNumbers np = new NumberOfPrimeNumbers();
    int value = np.countNumberOfPrime(arr);
    System.out.println(value);
  }
}
