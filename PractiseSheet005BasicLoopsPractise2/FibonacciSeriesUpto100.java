//  Write a program to print Fibonacci series up to 100 terms.
public class FibonacciSeriesUpto100 {
	public static void main(String[] args) {
		long a = -1;
		long b = 1;
		int terms = 0;
		while(terms < 100) {
			long sum = a + b;
			a = b;
			b = sum;
			System.out.print(sum + " ");
			++terms;
		}
		System.out.println();
	}
}