/* Write a program to print Eight with Star Pattern ?
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
		int row = 1;
		int end = 10;
		int extra = 2 * end - 1;
		while(row <= extra) {
			int col = 1;
			while(col <= end) {
				if(row == 1) {
					if(col != 1) {
						if(col != end) {
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
				else if(row == end) {
					if(col != 1) {
						if(col != end) {
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
				else if(row == extra) {
					if(col != 1) {
						if(col != end) {
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
				else if(col == end) {
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
					