// Write a program to check whether a number is palindrome or not.
public class IsPalindrome {
	public static void main(String[] args) {
		int num = 12321;
		int reverse = 0;
		for(int tmp = num; tmp > 0; tmp /= 10) {
			reverse *= 10;
			reverse += tmp % 10;
		}
		if(num == reverse) {
			System.out.println(num + " is palindrome");
		}
		else {
			System.out.println(num + " is not palindrome");
		}
	}
}