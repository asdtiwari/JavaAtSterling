/* Write a program to print number patterns? 
1 
1 2 1 
1 2 3 2 1 
1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
*/
public class Question43 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; ++i) {
			int num = 1;
			for(int j = 1; j < 2 * i; ++j) {
				System.out.print(num + " ");
				if(j < i) {
					++num;
				} else {
					--num;
				}
			}
			System.out.println();
		}
	}
}