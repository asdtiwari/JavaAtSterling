// Write a program to swap first and last digits of a number.
public class SwapFirstAndLastDigitsOfNumber {
	public static void main(String[] args) {
		int number = 12345678;
		int num = number;
		int digitCount = 0;
		while(num > 0) {
			++digitCount;
			num /= 10;
		}
		int separator = 1;
		while(digitCount > 1) {
			separator *= 10;
			--digitCount;
		}
		int first = number / separator;
		int last = number % 10;
		number = number / 10 * 10 + first;
		number = number % separator + (last * separator);
		System.out.println(number);
	}
}