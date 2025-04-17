/* Write a program to print number patterns? 
1 
1 1 
1 0 1 
1 0 0 1 
1 1 1 1 1
*/
public class Question38 {
	public static void main(String[] args) {
		int n = 10;
		for(int i = 1; i <= n; ++i) {
			for(int j = 1; j <= i; ++j) {
				if(i == n) {
					System.out.print(1 + " ");
				} else if(j == 1) {
					System.out.print(1 + " ");
				} else if(j == i) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}