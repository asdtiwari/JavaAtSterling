/* Write a program to print ? 
   A 
  AAA 
 AAAAA 
AAAAAAA 
 AAAAA 
  AAA 
   A
*/

public class PrintDiamondPatternWithA {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		int total = 2 * end;
		while(row < total) {
			int col = 1;
			while(col < total) {
				if(row <= end) {
					if(col > end - row) {
						if(col < end + row) {
							System.out.print("A");
						}
						else {
							System.out.print(" ");
						}
					}
					else {
						System.out.print(" ");
					}
				}
				else {
					if(col > row - end) {
						if(col < 3 * end - row) {
							System.out.print("A");
						}
						else {
							System.out.print(" ");
						}
					}
					else {
						System.out.print(" ");
					}
				}
				++col;
			}
			System.out.println();
			++row;
		}
	}
}