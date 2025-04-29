/* Write a program to find sum of all Prime numbers between 1 to 100. */
public class SumAllPrimeNumbersBetween1To100 {
	public static void main(String[] args) {

		System.out.print("Sum of Prime Numbers between 1 to 100 ");
		int sum = 0;
		for(int i = 1; i <= 100; ++i) {
			if(i == 1) {
				continue;
			}
			boolean isPrime = true;
			for(int j = 2, end = i / 2; j <= end; ++j) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}