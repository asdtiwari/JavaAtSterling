// Write a program to print odd numbers from 1 to 100
public class PrintOddNOFrom1To100 {
	public static void main(String[] args) {
		int num = 1;
		while(num <= 100) {
			if(num % 2 != 0) {
				System.out.print(num + " ");
			}
			++num;
		}
		System.out.println();
	}
}