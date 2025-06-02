/* Write a program to check given number is prime or not */
public class IsPrime {
	public static void main(String[] args) {
		int num = 10;
		if(num > 0) {
			if(num == 1) {
				System.out.println(num + " is neither a prime nor a composite number");
			} else {
				boolean isPrime = true;
				for(int i = 2; i < num / 2; ++i) {
					if(num % i == 0) {
						isPrime = false;
					}
				}
				if(isPrime) {
					System.out.println(num + " is a Prime number");
				} else {
					System.out.println(num + " is not a Prime number");
				}
			}
		} else {
			System.out.println("Enter a postive number");
		}
	}
}