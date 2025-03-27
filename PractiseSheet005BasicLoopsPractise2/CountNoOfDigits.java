//  Write a program to count the number of digits in a number.
public class CountNoOfDigits {
	public static void main(String[] args) {
		int num = 123445;
		int count = 0;
		while(num > 0) {
			++count;
			num /= 10;
		}
		System.out.println(count + " digits");
	}
}