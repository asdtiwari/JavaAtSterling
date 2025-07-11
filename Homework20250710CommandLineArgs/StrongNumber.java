// WAP to check whether the given number using CLI is Strong number or not
import java.math.BigInteger;
public class  StrongNumber {
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
				BigInteger num = new BigInteger(word);
				BigInteger sumOfFactorialOfDigits = BigInteger.ZERO;
				BigInteger temp = num; 
				final BigInteger TEN = new BigInteger("10");
				while(temp.compareTo(BigInteger.ZERO) != 0) {
					int rem = temp.mod(TEN).intValue();
					long factorial = 1;
					for(int i = 1; i <= rem; ++i) {
						factorial *= i;
					}
					sumOfFactorialOfDigits = sumOfFactorialOfDigits.add(BigInteger.valueOf(factorial));
					temp = temp.divide(TEN);	
				}
				if(sumOfFactorialOfDigits.compareTo(num) == 0) {
					System.out.println(num + " is a Strong Number.");
				} else {
					System.out.println(num + " is not a Strong Number.");
				}
			}
		} else {
			System.out.println("Re-execute the program and pass the integer value in CLI.");
		}
	}
}