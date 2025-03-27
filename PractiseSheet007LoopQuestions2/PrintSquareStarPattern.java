/* Write a program to print Square Star Pattern? 
*  *  *  *  * 
*  *  *  *  * 
*  *  *  *  * 
*  *  *  *  * 
*  *  *  *  *
*/
public class PrintSquareStarPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		while(row <= end) {
			int col = 1;
			while(col <= end) {
				System.out.print("* ");
				++col;
			}
			System.out.println();
			++row;
		}
	}
}