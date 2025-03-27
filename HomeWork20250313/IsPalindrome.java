// three digit number is palindrome or not conditional statement program
public class IsPalindrome {
	public static void main(String[] args) {
		int num = 909;

		if(num < 100) {
			System.out.println("Not a three digit number");
		} else if(num > 999) {
			System.out.println("Not a three digit number");
		} else {
			int reverse = (num % 10 * 100) + (num / 10 % 10 * 10) + (num / 100);
			if(reverse == num) {
				System.out.println(num + " is palindrome");
			} else {
				System.out.println(num + " isn't palindrome");
			}
		}
	}
}