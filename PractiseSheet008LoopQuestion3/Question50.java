/* Write a program to print number patterns? 
1 
2  4 
7  11 16 
22 29 37 46 
56 67 79 92 106 
*/
public class Question50 {
	public static void main(String[] args) {
		int n = 5;
		int num = 0;
		int sum = 1;
		for(int i = 1; i <= n; ++i) {
			for(int j = 1; j <= i; ++j) {
				sum = sum + num;
				System.out.print(sum + " ");
				++num;
			}
			System.out.println();
		}
	}
}