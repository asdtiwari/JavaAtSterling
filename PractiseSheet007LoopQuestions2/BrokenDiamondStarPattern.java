/* Write a program to print Diamond Star Pattern ?
      *  *
    * *  * *
  * * *  * * *
* * * *  * * * *
* * * *  * * * *
  * * *  * * *
    * *  * *
      *  *
*/
public class BrokenDiamondStarPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		int extra = 2 * end - 1;
		while(row < extra) {
			int col = 1;
			while(col <= extra) {
				if(col == end) {
					System.out.print("  ");
				}
				else if(row < end) {
					if(col >= end - row) {
						if(col <= end + row) {
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
				else if(col > row - end) {
					if(col < 3 * end - row) {
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