/* Write a program to print Inverted Right Triangle Star Pattern 
* * * * * 
* * * *
* * *
* * 
*
*/
public class InvertedRightTriangleStarPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		while(row <= end) {
			int col = 1;
			while(col <= end - row + 1) {
				System.out.print("* ");
				++col;
			}
			System.out.println();
			++row;
		}
	}
}