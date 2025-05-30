/* Write a program to print all Prime numbers between 1 to 100. */
public class PrintAllPrimeNumbersBetween1To100 {
	public static void main(String[] args) {

		System.out.println("Prime Numbers between 1 to 100");

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
				System.out.println(i);
			}
		}
	}
}