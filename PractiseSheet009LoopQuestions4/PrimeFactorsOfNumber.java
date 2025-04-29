/* Write a program to find all prime factors of a number. */
public class PrimeFactorsOfNumber {
	public static void main(String[] args) {

		int num = 17;

		System.out.print("All prime factors of " + num + " are ");
		for(int i = 2; i <= num; ++i) {
			if(num % i == 0) {
				boolean isPrime = true;
				for(int j = 2, endOfJ = i / 2; j <= endOfJ; ++j) {
					if(i % j == 0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println();
	}
}