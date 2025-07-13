// WAP to check whether the given number using CLI is perfect or not
public class PerfectNumber {
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
				int sumOfFactors = 0;
				int numSqrt = (int)Math.sqrt(num);
				for(int i = 1; i <= numSqrt; ++i) {
					if(num % i == 0) {
						sumOfFactors = sumOfFactors + i;
						sumOfFactors = sumOfFactors + (num / i);
					}
				}
				if(num == sumOfFactors) {
					System.out.println(num + " is Perfect number.");
				} else {
					System.out.println(num + " is not a Perfect number.");
				}
			}
		} else {
			System.out.println("Re-execute the program and pass the integer value in CLI.");
		}
	}
}