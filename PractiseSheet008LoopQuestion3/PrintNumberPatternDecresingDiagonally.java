/* Write a program to print number patterns? 
5 5 5 5 5 
5 4 4 4 4 
5 4 3 3 3 
5 4 3 2 2 
5 4 3 2 1 */
public class PrintNumberPatternDecresingDiagonally {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; ++i) {
			for(int j = 1; j <= n; ++j) {
				if(j >= i) {
					System.out.print(n + 1 - i + " ");
				}
				else {
					System.out.print(n + 1 - j + " ");
				}
			}
			System.out.println();
		}
	}
}