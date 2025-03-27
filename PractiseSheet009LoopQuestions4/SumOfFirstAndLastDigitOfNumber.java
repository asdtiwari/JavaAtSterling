// Write a program to find sum of first and last digit of a number. 
public class SumOfFirstAndLastDigitOfNumber {
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
		int sum = 0;
		if(first > -1) {
			sum = first + last;
		}
		System.out.println("Sum of First and Last digit of " + number + " is " + sum);
	}
}