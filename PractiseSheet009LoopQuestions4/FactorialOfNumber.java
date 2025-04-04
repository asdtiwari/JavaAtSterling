// Write a program to calculate factorial of a number. 
public class FactorialOfNumber {
	public static void main(String[] args) {
		int num = 12;
		int fact = 1;
		for(int i = 1; i <= num; ++i) {
			fact *= i;
		}
		System.out.println("factorial of " + num + " " + fact);
	}
}