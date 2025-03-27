/* Write a program to print ? 
    A  A 
   BB  BB 
  CCC  CCC 
 DDDD  DDDD 
EEEEE  EEEEE  
*/

public class PrintAlphabetPyramidPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		char alpha = 'A';
		while(row <= end) {
			int col = 1;
			while(col <= end - row) {
				System.out.print(" ");
				++col;
			}
			col = 1;
			while(col <= row) {
				System.out.print(alpha);
				++col;
			}
			System.out.print(" ");
			col = 1;
			while(col <= row) {
				System.out.print(alpha);
				++col;
			}
			System.out.println();
			++alpha;
			++row;
		}
	}
}			