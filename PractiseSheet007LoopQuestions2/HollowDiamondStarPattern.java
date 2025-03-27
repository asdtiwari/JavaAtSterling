/* Write a program to print Hollow Diamond Star Pattern?
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
*/
public class HollowDiamondStarPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		int extra = 2 * end;
		while(row <= extra) {
			int col = 1;
			while(col <= extra) {
				if(row <= end) {
					if(col <= end - row + 1) {
						System.out.print("* ");
					}
					else if(col >= end + row) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				else if(col <= row - end) {
					System.out.print("* ");
				}
				else if(col > 3 * end - row){
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