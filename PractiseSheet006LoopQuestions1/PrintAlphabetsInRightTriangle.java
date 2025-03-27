/* Write a program to print ? 
A 
BC 
DEF 
GHIJ 
KLMNO 
*/
public class PrintAlphabetsInRightTriangle {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		char alpha = 'A';
		while(row <= end) {
			int col = 1;
			while(col <= row) {
				System.out.print(alpha);
				++alpha;
				++col;
			}
			System.out.println();
			++row;
		}
	}
}