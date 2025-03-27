// Write a program to check whether a number is Prime number or not.
public class IsPrime {
	public static void main(String[] args) {
		int num = 13;
		int fact = 2;
		boolean isPrime = true;
		while(fact < num/2) {
			if(num % fact == 0) {
				isPrime = false;
			}
			++fact;
		}
		if(num < 2) {
			System.out.println("Enter no. larger than 2");
		}
		else if(isPrime) {
			System.out.println(num + " is prime number");
		}
		else {
			System.out.println(num + " is not prime number");
		}
	}
}