/* Write a program to print number patterns? 
5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1
*/
public class Question27 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; ++i) {
			for(int j = n + 1 - i; j > 0; --j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}