/*  Write a program to check whether a number is Prime number or not. */
public class IsPrimeNumber {
	public static void main(String[] args) {
		int num = 11;
		boolean isPrime = true;
		if(num < 3) {
			System.out.println("Give number greater than 2");
		}
		else {
			for(int loop = 3; loop <= num / 2; ++loop) {
				if(num % loop == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println(num + " is a prime number");
			}
			else {
				System.out.println(num + " is not a prime number");
			}
		}
	}
}