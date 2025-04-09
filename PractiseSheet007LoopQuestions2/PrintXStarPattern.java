/* Write a program to print X Star Pattern? 
*               *
  *           *
    *       *     
      *   *
        *    
      *   * 
    *       *     
  *           *          
*               * 
*/
public class PrintXStarPattern {
	public static void main(String[] args) {
		int n = 5;
		int totalRow = 2 * n;
		int row = 1;
		while(row < totalRow) {
			int col = 1;
			while(col < totalRow) {
				if(col == row) {
					System.out.print("* ");
				}
				else if(col == totalRow - row) {
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