/*  Write a program to count the number of digits in a number. */
public class CountDigitsOfNumber {
	public static void main(String[] args) {
		int count = 0;
		for(int num = 12345; num > 0; num /= 10) {
			++count;
		}
		System.out.println(count + " digits");
	}
}