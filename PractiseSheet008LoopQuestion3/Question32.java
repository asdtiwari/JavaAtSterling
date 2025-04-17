/* Write a program to print number patterns? 
1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9
*/
public class Question32 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; ++i) {
			for(int j = i; j < 2 * i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}