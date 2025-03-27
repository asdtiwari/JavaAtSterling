/* Write a program to print ? 
AAAAA 
AAAAA 
AAAAA 
AAAAA 
AAAAA */

public class PrintASquare {
	public static void main(String[] args) {
		int i = 0;
		int upto = 5;
		while(i < upto) {
			int j = 0;
			while(j < upto) {
				System.out.print("A");
				++j;
			}
			System.out.println();
			++i;
		}
	}
}