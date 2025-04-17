/* Write a program to print number patterns? 
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0
*/
public class PrintNumberPatternZeroOneInColumn {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; ++i) {
			for(int j = 0; j < n; ++j) {
				System.out.print(j % 2);
			}
			System.out.println();
		}
	}
}