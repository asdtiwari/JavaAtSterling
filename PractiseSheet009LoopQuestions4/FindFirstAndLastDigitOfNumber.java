// Write a program to find the first and last digit of a number. 
public class FindFirstAndLastDigitOfNumber {
	public static void main(String[] args) {
		int number = -912345;
		int first = -1;
		int last = -1;
		int num = number;
		if(num < 0) {
			num *= -1;
		}
		while(num > 0) {
			if(first == -1) {
				first = num % 10;
			}
			if(num / 10 == 0) {
				last = num % 10;
			}
			num /= 10;
		}
		System.out.println("First and Last digit of " + number + " is " + first + " and " + last);
	}
}