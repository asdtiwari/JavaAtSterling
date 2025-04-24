/* Write a program to find all prime factors of a number. */
public class PrimeFactorsOfNumber {
	public static void main(String[] args) {
		int num = 100;
		System.out.println("Prime factors of " + num + " is \n1");
		int fact = 2;
		int prev = 1;
		while(num > fact) {
			if(num % fact == 0) {
				num = num / fact;
				if(prev != fact) {
					System.out.println(fact);
				}
				prev = fact;
			} else {
				++fact;
			}
		}		
	}
}