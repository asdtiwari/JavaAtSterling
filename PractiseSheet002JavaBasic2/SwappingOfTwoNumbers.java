/* Write a program to swap two numbers by using third variable */

public class SwappingOfTwoNumbers {
	public static void main(String[] args) {
		int num1 = 10; 
		int num2 = 20;
		System.out.println(
"Before Swapping \n" +
"num1 = " + num1 + "\n" +
"num2 = " + num2);
		
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println(
"After Swapping \n" +
"num1 = " + num1 + "\n" + 
"num2 = " + num2);
	}
}