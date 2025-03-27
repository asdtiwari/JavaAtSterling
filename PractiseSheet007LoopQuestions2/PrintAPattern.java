/* Write a program to print A star pattern ?
        *
      *   *
    * * * * *
  *           *
*               *
*/
public class PrintAPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		int extra = 2 * end - 1;
		while(row <= end) {
			int col = 1;
			while(col <= extra) {
				if(row == end / 2 + 1) {
					if(col >= end - row + 1) {
						if(col <= end + row - 1) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					else {
						System.out.print("  ");
					}
				}
				else if(col == end + row - 1) {
					System.out.print("* ");
				}
				else if(col == end - row + 1) {
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