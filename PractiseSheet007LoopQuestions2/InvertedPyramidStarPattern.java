/* Write a program to print Inverted Pyramid Star Pattern 
* * * * * * * * *
  * * * * * * * 
    * * * * *
      * * *
        *
*/
public class InvertedPyramidStarPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		int extra = 2 * end - 1;
		while(row <= end) {
			int col = 1;
			while(col <= extra) {
				if(col >= row) {
					if(col <= extra - row + 1) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
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