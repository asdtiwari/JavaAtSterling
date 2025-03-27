// Write a program to print all Prime numbers between 1 to 100.
public class PrintPrimeNoFrom1To100 {
	public static void main(String[] args) {
		int num = 3;
		while(num <= 100) {
			int fact = 2;
			boolean isPrime = true;
			while(fact < num/2) {
				if(num % fact == 0) {
					isPrime = false;
				}
				++fact;
			}
			if(isPrime) {
				System.out.print(num + " ");
			}
			++num;
		}
		System.out.println();
	}
}
