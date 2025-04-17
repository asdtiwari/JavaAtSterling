/* Write a program to print number patterns? 
1 
1 3 1 
1 3 5 3 1 
1 3 5 7 5 3 1 
1 3 5 7 9 7 5 3 1
*/
public class Question41 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; ++i) {
			int num = 1;
			for(int j = 1; j < 2 * i; ++j) {
				System.out.print(num + " ");
				if(j < i) {
					num += 2;
				} else {
					num -= 2;
				}
			}
			System.out.println();
		}
	}
}