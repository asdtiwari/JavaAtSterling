// Write a program to print a table from 2 to 10 ? 

public class PrintTable2To10 {
	public static void main(String[] args) {
		int num = 2;
		int upto = 10;
		while(num <= upto) {
			int mul = 1;
			while(mul <= 10) {
				System.out.print(num * mul + " ");
				++mul;
			}
			++num;
			System.out.println();
		}
	}
}
			