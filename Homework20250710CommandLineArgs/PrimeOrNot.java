// WAP to check whether the given number using CLI is prime or not
public class PrimeOrNot {
	public static void main(String[] args) {
		if(args.length > 0) {
			for(String word : args) {
				for(int i = 0, len = word.length(); i < len; ++i) {
					if(word.charAt(i) < '0'|| word.charAt(i) > '9') {
						System.out.println("Enter digits only!!!");
						return;
					}
				}
			}
			for(String word : args) {
				int num = Integer.parseInt(word);
				if(num == 1) {
					System.out.println(num + " is neither composite nor prime");
				} else {
					int numSqrt = (int)Math.sqrt(num);
					boolean isPrime = true;
					for(int i = 2; i <= numSqrt; ++i) {
						if(num % i == 0) {
							isPrime = false;
							break;
						}
					}
					if(isPrime) {
						System.out.println(num + " is a prime number");
					} else {
						System.out.println(num + " is not a prime number");
					}
				}
			}
		} else {
			System.out.println("Re-execute the program and pass the integer value in CLI.");
		}
	}
}