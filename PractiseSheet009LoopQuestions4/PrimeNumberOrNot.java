/* Write a program to check whether a number is Prime number or not. */
public class PrimeNumberOrNot {
	public static void main(String[] args) {
		int num = 2;
		if(num == 1) {
			System.out.println("1 is Neither prime nor composite");
		} else if(num < 2) {
			System.out.println("Enter Positive Number");
		} else {
			boolean isPrime = true;
			if(num > 2) {
				for(int i = 2; i < num / 2; ++i) {
					if(num % 2 == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if(isPrime) {
				System.out.println(num + " is a Prime number");
			} else {
				System.out.println(num + " is not a Prime number");
			}
		}
	}
}
