/* Write a Java program to print the result of the following operations 
Test Data:
I. -5 + 8 * 6
II. (55 + 9) % 9
III. 20 + -3 * 5 / 8
IV. 5 + 15 / 3 * 2 - 8 % 3 */

public class PrintResultOfOperations {
	public static void main(String[] args) {
		System.out.println("-5 + 8 * 6 = " + (-5 + 8 * 6) + "\n" + "(55 + 9) % 9 = " + ((55 + 9) % 9) + "\n" + "20 + -3 * 5 / 8 = " + (20 + (-3) * 5 / 8) + "\n" + "5 + 15 / 3 * 2 - 8 % 3 = " + (5 + 15 / 3 * 2 - 8 % 3));
	}
}