/* Question 21 . Write a program to print number patterns? 
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 */
public class Question21 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; ++i) {
			for(int j = 1; j <= n + 1 - i; ++j) {
				System.out.print(n + 1 - i + " ");
			}
			System.out.println();
		}
	}
}