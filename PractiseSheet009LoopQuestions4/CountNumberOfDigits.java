// Write a program to count the number of digits in a number.
public class CountNumberOfDigits {
	public static void main(String[] args) {
		int num = 12345;
		int countDigit = 0;
		while(num > 0) {
			++countDigit;
			num /= 10;
		}
		System.out.println(countDigit + " digits");
	}
}