/* Write a program to print number patterns? 
1 0 0 0 1 
0 1 0 1 0 
0 0 1 0 0 
0 1 0 1 0 
1 0 0 0 1
*/
public class PrintNumberPatternDiagonalOneInsideZero {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				if(i == j) {
					System.out.print(1);
				}
				else if(j == n - i - 1) {
					System.out.print(1);
				}
				else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}