/* Write a program to print the hollow pyramid star pattern star pattern?
        *
      *   *
    *       *
  *           *
* * * * * * * * *
*/

public class HollowPyramidStarPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		int extra = end * 2 - 1;
		while(row <= end) {
			int col = 1;
			while(col <= extra) {
				if(col == end + row - 1) {
					System.out.print("* ");
				}
				else if(col == end - row + 1) {
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