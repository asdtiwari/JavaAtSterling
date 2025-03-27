/* Write a program to print Hollow Inverted Pyramid Star Pattern 
* * * * * * * * *
  * * * * * * * 
    * * * * *
      * * *
        *
*/
public class HollowInvertedPyramidStarPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		int extra = 2 * end - 1;
		while(row <= end) {
			int col = 1;
			while(col <= extra) {
				if(row == 1) {
					System.out.print("* ");
				}
				else if(col == row) {
					System.out.print("* ");
				}
				else if(col == extra - row + 1) {
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