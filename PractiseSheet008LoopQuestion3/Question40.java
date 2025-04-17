/* Write a program to print number patterns? 
1 
2 4 
1 3 5 
2 4 6 8 
1 3 5 7 9
*/
public class Question40 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; ++i) {
			int toPrint;
			if(i % 2 == 0) {
				toPrint = 2;
			}
			else {
				toPrint = 1;
			}
			for(int j = 1; j <= i; ++j) {
				System.out.print(toPrint + " ");
				toPrint += 2;
			}
			System.out.println();
		}
	}
}