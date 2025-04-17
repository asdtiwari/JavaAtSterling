/*  Write a program to print number patterns? 
1 2 3 4 5 
6 7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25
*/
public class PrintNumberInMatrix {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1, j = 1; i <= n * n; ++i) {
			System.out.print(i + " ");
			if(i == n * j) {
				System.out.println();
				++j;
			}
		}
	}
}
