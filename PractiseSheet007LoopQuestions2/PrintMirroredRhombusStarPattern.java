/* Write a program to print Mirrored Rhombus Star Pattern
* * * * *
 * * * * *
  * * * * *
   * * * * *
    * * * * *
*/

public class PrintMirroredRhombusStarPattern {
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
				System.out.print("* ");
				++col;
			}
			System.out.println();
			++row;
		}
	}
}