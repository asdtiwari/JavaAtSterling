// Write a program to enter a number and print its reverse.
public class ReverseNumber {
	public static void main(String[] args) {
		int num = 123456;
		int rev = 0;
		while(num > 0) {
			rev *= 10;
			rev += num % 10;
			num /= 10;
		}
		System.out.println(rev);
	}
}