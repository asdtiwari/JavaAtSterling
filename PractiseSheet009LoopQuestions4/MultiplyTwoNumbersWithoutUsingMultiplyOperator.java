/* Write a program to multiply two numbers without using  “x” 
operator */
public class MultiplyTwoNumbersWithoutUsingMultiplyOperator {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 4;
		int product = 0;
		for(int i = 0; i < num2; ++i) {
			product = product + num1;
		}
		System.out.println(num1 + " x " + num2 + " = " + product);
	}
}