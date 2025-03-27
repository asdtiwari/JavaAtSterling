/*  Write a program to calculate factorial of a number. */
public class FactorialOfNumber {
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		for(int loop = 1; loop <= num; ++loop) {
			fact *= loop;
		}
		System.out.println(fact);
	}
}