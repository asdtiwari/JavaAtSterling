/* Write a program to print number patterns? 
1 1 0 1 1 
1 1 0 1 1 
0 0 0 0 0 
1 1 0 1 1 
1 1 0 1 1 
*/
public class PrintNumberPatternsZeroPlusOneOutside {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				if(j == n / 2) {
					System.out.print(0);
				} else if(i == n / 2) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
			}
			System.out.println();
		}
	}
}