/* Write a program to print Mirrored Half Diamond Star Pattern?
        *
      * *
    * * *
  * * * *
* * * * *
  * * * *
    * * *
      * *
        *
*/
public class MirroredHalfDiamondStarPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		int extra = 2 * end - 1;
		while(row <= extra) {
			int col = 1;
			while(col <= end) {
				if(row <= end) {
					if(col >= end - row + 1) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				else if(col >= row - end + 1) {
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