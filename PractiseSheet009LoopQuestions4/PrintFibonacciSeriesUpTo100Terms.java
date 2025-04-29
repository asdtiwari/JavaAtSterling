/* Write a program to print Fibonacci series up to 100 terms. */
public class PrintFibonacciSeriesUpTo100Terms {
	public static void main(String[] args) {
		int end = 100;
		long a = -1;
		long b = 1;
		System.out.println("Fibonacci Series up to 100 terms.");
		for(int i = 1; i <= end; ++i) {
			long sum = a + b;
			a = b;
			b = sum;
			if(sum < 0) {
				System.out.println("Range Overflow at " + i + " term");
				break;
			}
			System.out.println(sum);
		}
	}
}