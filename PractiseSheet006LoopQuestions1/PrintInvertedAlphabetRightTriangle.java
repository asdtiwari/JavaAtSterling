/* Write a program to print ? 
ABCDE 
ABCD 
ABC 
AB 
A  */
public class PrintInvertedAlphabetRightTriangle {
	public static void main(String[] args) {
		int row = 0;
		int end = 5;
		while(row < end) {
			int col = 0;
			char alpha = 'A';
			while(col < end - row) {
				System.out.print(alpha);
				++alpha;
				++col;
			}
			System.out.println();
			++row;
		}
	}
}