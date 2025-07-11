// WAP to check the given numbers using CLI is armstrong or not
public class ArmstrongOrNot {
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
				int countDigit = 0;
				for(int temp = num; temp > 0; temp /= 10, ++countDigit);						int powerSumOfDigits = 0;
				for(int temp = num; temp > 0; temp /= 10) {
					int digit = temp % 10;
					int power = 1;
					for(int i = 0; i < countDigit; ++i) {
						power *= digit;
					}
					powerSumOfDigits += power;
				}
				if(powerSumOfDigits == num) {
					System.out.println(word + " is Armstrong.");
				} else {
					System.out.println(word + " is not Armstrong.");
				}
			}
		} else {
			System.out.println("Re-execute the program and pass the integer value in CLI.");
		}
	}
}