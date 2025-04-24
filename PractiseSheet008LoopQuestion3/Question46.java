/* Write a program to print number patterns? 
1 
2 1 
1 2 3 
4 3 2 1 
1 2 3 4 5
*/
public class Question46 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; ++i) {
			int numToPrint;
			if(i % 2 == 0) {
				numToPrint = i;
			} else {
				numToPrint = 1;
			}
			for(int j = 1; j <= i; ++j) {
				System.out.print(numToPrint + " ");
				if(i % 2 == 0) {
					--numToPrint;
				} else {
					++numToPrint;
				}
			}
			System.out.println();
		}
	}
}