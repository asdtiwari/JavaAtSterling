/* Write a program to print number patterns? 
5  5  5  5  5  5  5  5  5 
5  4  4  4  4  4  4  4  5 
5  4  3  3  3  3  3  4  5 
5  4  3  2  2  2  3  4  5 
5  4  3  2  1  2  3  4  5 
5  4  3  2  2  2  3  4  5 
5  4  3  3  3  3  3  4  5 
5  4  4  4  4  4  4  4  5 
5  5  5  5  5  5  5  5  5 
*/
public class PrintNumberPatternsDecreasingInward {
	public static void main(String[] args) {
		int n = 6;
		int extra = 2 * n;
		for(int i = 1; i < extra; ++i) {
			for(int j = 1, k = n; j < extra; ++j) {
				System.out.print(k + " ");
				if(i <= n) {
					if(j < i) {
						--k;
					}
					else if(j > extra - i - 1) {
						++k;
					}
				} else if(j < extra - i) {
					--k;
				} else if(j >= i) {
					++k;
				}
			}
			System.out.println();
		}
	}
}