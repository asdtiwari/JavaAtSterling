// Write a program to check whether a number is palindrome or not.
public class IsPalindrome {

	public static void main(String[] args) {
		int number = 113;
		int num = number;
	
		int reverse = 0;
		
		while(num > 0){
			reverse *= 10;
			reverse += num % 10;
			num /= 10;
		}
		if(reverse == number) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}