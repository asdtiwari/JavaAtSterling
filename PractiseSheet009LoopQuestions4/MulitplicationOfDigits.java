// Write a program to calculate product of digits of a number.
public class MulitplicationOfDigits {
	public static void main(String[] args) {
		int num = 123456;
		int multiply = 1;
		while(num > 0) {
			multiply *= num % 10;
			num /= 10;
		}
		System.out.println(multiply);
	}
}
		