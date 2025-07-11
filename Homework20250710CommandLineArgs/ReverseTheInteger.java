// WAP to reverse the given integer using CLI
import java.math.BigInteger;
public class  ReverseTheInteger {
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
				BigInteger rev = BigInteger.ZERO;
				final BigInteger TEN = new BigInteger("10");
				while(num.compareTo(BigInteger.ZERO) != 0) {
					BigInteger rem = num.mod(TEN);
					rev = rev.multiply(TEN);
					rev = rev.add(rem);
					num = num.divide(TEN);
				}
				System.out.println("Reverse of " + word + " is " + rev);
			}
		} else {
			System.out.println("Re-execute the program and pass the integer value in CLI.");
		}
	}
}