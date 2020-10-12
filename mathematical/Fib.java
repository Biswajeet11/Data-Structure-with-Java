/*
 Calculate fib of a number


*/

public class Fib {

	public int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		Fib f = new Fib();
		int s = f.fibonacci(9);
		System.out.println(s);
	}

}
