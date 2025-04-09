/* Write a program to print Plus Star Pattern? 
		+ 
		+ 
		+ 
		+	 
+   +   +   +   +   +   +   +   + 
		+ 
		+ 
		+ 
		+ 
*/
public class PrintPlusStarPattern {
	public static void main(String[] args) {
		int n = 5;
		int totalRow = 2 * n;
		int row = 1;
		while(row < totalRow) {
			int col = 1;
			while(col < totalRow) {
				if(col == n) {
					System.out.print("+ ");
				}
				else if(row ==n) {
					System.out.print("+ ");
				}
				else {
					System.out.print("  ");
				}
				++col;
			}
			System.out.println();
			++row;
		}
	}
}