/* Write a program to print number patterns? 
1                 1 
1 2             2 1 
1 2 3         3 2 1 
1 2 3 4     4 3 2 1 
1 2 3 4 5 5 4 3 2 1 
*/
public class Question48 {
	public static void main(String[] args) {
		int n = 5;
		int spaces = 2 * n - 2;
		for(int i = 1; i <= n; ++i) {
			for(int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			for(int j = 1; j <= spaces; ++j) {
				System.out.print("  ");
			}
			for(int j = i; j > 0; --j) {
				System.out.print(j + " ");
			}
			System.out.println();
			spaces -= 2;
		}
	}
}