/* Write a program to swap two numbers without using third variable and using divide and multiply */

public class SwapTwoNumbersUsingDivideMultiply {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println(
"Before Swapping \n" +
"num1: " + num1 + "\n" +
"num2: " + num2);

		num1 = num1 * num2;
		num2 = num1 / num2;
		num1 = num1 / num2;
		System.out.println(
"After Swapping \n" +
"num1: " + num1 + "\n" + 
"num2: " + num2);
	}
}