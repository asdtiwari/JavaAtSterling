/* Write a program to print number patterns? 
1 2 3 4 5 
2 3 4 5 1 
3 4 5 2 1 
4 5 3 2 1 
5 4 3 2 1
*/
public class PrintNumberPatternStartWithRowAndCycle {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; ++i) {
			for(int j = 1, k = i; j <= n; ++j) {
				System.out.print(k);
				if(k != 5) {
					++k;
				}
				else {
					k = 1;
				}
			}
			System.out.println();
		}
	}
}