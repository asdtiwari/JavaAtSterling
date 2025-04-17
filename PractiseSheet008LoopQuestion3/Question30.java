/*  Write a program to print number patterns? 
5 
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5 */
public class Question30 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 5; i > 0; --i) {
			for(int j = i; j <= n; ++j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}