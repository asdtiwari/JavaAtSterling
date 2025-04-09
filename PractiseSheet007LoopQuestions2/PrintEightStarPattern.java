/* Write a program to print Eight with Star Pattern? 
  * * *
*       *
*       *
*       *
  * * *
*       *
*       *
*       *
  * * *
*/

public class PrintEightStarPattern {
	public static void main(String[] args) {
		int n = 5;
		int totalRow = 2 * n;
		int row = 1;
		while(row < totalRow) {
			int col = 1;
			while(col <= n) {
				if(row == 1) {
					if(col > 1) {
						if(col < n) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					else {
						System.out.print("  ");
					}
				}
				else if(row == n) {
					if(col > 1) {
						if(col < n) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					else {
						System.out.print("  ");
					}
				}
				else if(row == totalRow - 1) {
					if(col > 1) {
						if(col < n) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					else {
						System.out.print("  ");
					}
				}
				else if(col == 1) {
					System.out.print("* ");
				}
				else if(col == n) {
					System.out.print("* ");
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