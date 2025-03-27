/* Write a program to print even numbers from 1 to 100 */
public class PrintEvenNumbersFrom1To100 {
	public static void main(String[] args) {
		for(int num = 1; num <= 100; ++ num) {
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
	}
}