/* Write a program to print ? 
    A 
   ABC 
  ABCDE 
 ABCDEFG 
ABCDEFGHI */

public class PyramidLikeAlphabetPattern {
	public static void main(String[] args) {
		int row = 0;
		int end = 5;
		int extra = 1;
		while(row < end) {
			int col = 0;
			while(col < end - row) {
				System.out.print(" ");
				++col;
			}
			col = 0;
			char alpha = 'A';
			while(col < row + extra) {
				System.out.print(alpha);
				++alpha;
				++col;
			}
			System.out.println();
			++extra;
			++row;
		}
	}
}