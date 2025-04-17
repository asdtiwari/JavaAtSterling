/* Write a program to print number patterns? 
1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 1
*/
public class PrintNumberPatterns1 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; ++i) {
			for(int j = 1; j <= n; ++j) {
				System.out.print(1);
			}
			System.out.println();
		}
	}
}