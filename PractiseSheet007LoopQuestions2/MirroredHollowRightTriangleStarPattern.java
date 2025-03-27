/* Write a program to print Mirrored Hollow Right Triangle Star Pattern? 
            * 
         *  * 
      *     * 
   *        * 
*  *  *  *  * 
*/
public class MirroredHollowRightTriangleStarPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		while(row <= end) {
			int col = 1;
			while(col <= end - row) {
				System.out.print("  ");
				++col;
			}
			col = 1;
			while(col <= row) {
				if(col == 1) {
					System.out.print("* ");
				}
				else if(col == row) {
					System.out.print("* ");
				}
				else if(row == end) {
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