/* Write a program to print number patterns? 
1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1
*/
public class PrintNumberPatternsOneZeroSequence {
	public static void main(String[] args) {
		int n = 5;
		int times = n * n;
		for(int i = 1, j = 1; i <= times; ++i) {
			System.out.print(i % 2);
			if(i == n * j) {
				System.out.println();
				++j;
		 	}
		}
	}
}