/* Write a program to print Half Diamond Star Pattern?
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
*/
public class HalfDiamondStarPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		int extra = 2 * end - 1;
		while(row <= extra) {
			int col = 1;
			while(col <= end) {
				if(row <= end) {
					if(col <= row) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				else if(col <= extra - row + 1) {
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