// Write a program to print odd numbers between 1 to 100
public class PrintOddNOBetween1To100 {
	public static void main(String[] args) {
		int num = 2;
		while(num < 100) {
			if(num % 2 != 0) {
				System.out.print(num + " ");
			}
			++num;
		}
		System.out.println();
	}
}