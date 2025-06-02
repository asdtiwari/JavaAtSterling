/* Write a program to find whether a String is palindrome or not? */
public class IsPalindrome {
	public static void main(String[] args) {
		String str = "MADAM";
		boolean isPalindrome = true;
		for(int i = 0, len = str.length(), end = len / 2; i < end; ++i) {
			if(str.charAt(i) != str.charAt(len - 1 - i)) {
				isPalindrome = false; 
				break;
			}
		}
		if(isPalindrome) {
			System.out.println(str + " is Palindrome");
		} else {
			System.out.println(str + " isn't Palindrome");
		}
	}
}