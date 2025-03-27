//  Write a program to calculate factorial of a number.  
public class Factorial {
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		System.out.print("Factorial of " + num + " is ");
		while(num > 0) {
			fact *= num;
			--num;
		}
		System.out.println(fact);
	}
}