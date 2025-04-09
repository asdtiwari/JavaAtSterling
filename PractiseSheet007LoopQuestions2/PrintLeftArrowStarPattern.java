/* Write a program to print Left Arrow Star Pattern? 
       *  *  *  *  * 
      *  *  *  * 
    *  *  * 
  *  * 
* 
  *  * 
    *  *  * 
      *  *  *  * 
	*  *  *  *  *
*/
public class PrintLeftArrowStarPattern {
	public static void main(String[] args) {
		int n = 5;
		int totalRow = 2 * n;
		int row = 1;
		while(row < totalRow) {
			int spaces = 0;
			if(row <= n) {
				spaces = n - row;
			}
			else {
				spaces = row - n;
			}
			while(spaces > 0) {
				System.out.print(" ");
				--spaces;
			}
			int star = 0;
			if(row <= n) {
				star = n + 1 - row;
			}
			else {
				star = row + 1 - n;
			}
			while(star > 0) {
				System.out.print("* ");
				--star;
			}
			System.out.println();
			++row;
		}
	}
}
				