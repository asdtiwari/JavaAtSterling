/* Write a program to print ? 
A 
AB 
ABC 
ABCD 
ABCDE */

public class PrintAlphabetRightTriangle {
	public static void main(String[] args) {
		int row = 0;
		int end = 5;
		while(row < end) {
			int col = 0;
			char alpha = 'A';
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