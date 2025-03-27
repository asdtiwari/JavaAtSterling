/* Write a program to print Pyramid Star Pattern 
        *
      * * * 
    * * * * * 
  * * * * * * *
* * * * * * * * *
*/
public class PrintPyramidStarPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		int extra = 0;
		while(row <= end) {
			int col = 1;
			while(col <= end - row) {
				System.out.print("  ");
				++col;
			}
			col = 1;
			while(col <= row + extra) {
				System.out.print("* ");
				++col;
			}
			System.out.println();
			++extra;
			++row;
		}
	}
}