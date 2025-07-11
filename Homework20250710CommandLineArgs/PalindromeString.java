// WAP to check the given word using CLI is palindrome or not
public class PalindromeString {
	public static void main(String[] args) {
		if(args.length > 0) {
			for(String word : args) {
				boolean isPalindrome = true;
				for(int i = 0, len = word.length(), halfLen = len / 2; i < halfLen; ++i) {
					if(word.charAt(i) != word.charAt(len - 1 - i)) {
						isPalindrome = false;
						break;
					}
				}
				if(isPalindrome) {
					System.out.println(word + " is Palindrome.");
				} else {
					System.out.println(word + " is not Palindrome.");
				}
			}
		} else {
			System.out.println("Re-execute the program and pass the integer value in CLI.");
		}
	}
}