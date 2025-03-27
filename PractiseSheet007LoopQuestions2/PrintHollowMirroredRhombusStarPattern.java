/* Write a program to print Hollow Mirrored Rhombus Star Pattern
* * * * *
 *       *
  *       *
   *       *
    * * * * *
*/

public class PrintHollowMirroredRhombusStarPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		while(row <= end) {
			int col = 1;
			while(col <= row) {
				System.out.print(" ");
				++col;
			}
			col = 1;
			while(col <= end) {
				if(row == 1) {
					System.out.print("* ");
				}
				else if(row == end) {
					System.out.print("* ");
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