/* Write a program to print ? 
AAAAA 
  A 
  A 
  A 
AAAAA */

public class PrintIPatternWithA {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		while(row <= end) {
			int col = 1;
			while(col <= end) {
				if(row == 1) {
					System.out.print("A");
				}
				else if(row == end) {
					System.out.print("A");
				}
				else if(col == end/2 + 1) {
					System.out.print("A");
				}
				else {
					System.out.print(" ");
				}
				++col;
			}
			System.out.println();
			++row;
		}
	}
}