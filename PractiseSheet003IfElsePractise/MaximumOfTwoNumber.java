// Write a program to find maximum between two numbers 

public class MaximumOfTwoNumber {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		if(num1 > num2) {
			System.out.println("num1 (" + num1 + ") is greatest");
		}
		else if (num1 == num2) {
			System.out.println("num1, num2 (" + num1 + ") both are greater");
		}
		else {
			System.out.println("num2 (" + num1 + ") is greatest");
		}
	}
}