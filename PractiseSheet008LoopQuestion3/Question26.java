/* Write a program to print number patterns? 
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 */
public class Question26 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; ++i) {
			for(int j = i; j > 0; --j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}