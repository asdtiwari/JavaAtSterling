/* Write a program to reverse an integer */
public class ReverseInteger {
	public static void main(String[] args) {
		int num = 1233;
		int temp = num;
		int rev = 0;
		do {
			rev = rev * 10;
			rev = rev + temp % 10;
			temp = temp / 10;
		} while(temp > 0);
		System.out.println("Reverse of " + num + " is " + rev);
	}
}