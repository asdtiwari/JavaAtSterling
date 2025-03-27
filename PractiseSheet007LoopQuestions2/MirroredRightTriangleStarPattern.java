/* Write a program to print Mirrored Right Triangle Star Pattern? 
            * 
         *  * 
      *  *  * 
   *  *  *  * 
*  *  *  *  * 
*/
public class MirroredRightTriangleStarPattern {
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
				System.out.print("* ");
				++col;
			}
			System.out.println();
			++row;
		}
	}
}