/* Write a program to print Hollow Inverted Right Triangle Star Pattern 
* * * * * 
*     *
*   *
* * 
*
*/
public class HollowInvertedRightTriangleStarPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		while(row <= end) {
			int col = 1;
			while(col <= end - row + 1) {
				if(col == 1) {
					System.out.print("* ");
				}
				else if(col == end - row + 1) {
					System.out.print("* ");
				}
				else if(row == 1) {
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