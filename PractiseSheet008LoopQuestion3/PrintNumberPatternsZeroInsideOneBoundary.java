/* Write a program to print number patterns? 
1 1 1 1 1 
1 0 0 0 1 
1 0 0 0 1 
1 0 0 0 1 
1 1 1 1 1
*/
public class PrintNumberPatternsZeroInsideOneBoundary {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; ++i) {
			for(int j = 1; j <= n; ++j) {
				if(i == 1) {
					System.out.print(1);
				} else if(i == n) {
					System.out.print(1);
				} else if(j == 1) {
					System.out.print(1);
				} else if(j == n) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}