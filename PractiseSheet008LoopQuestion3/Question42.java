/* Write a program to print number patterns? 
2 
2 4 2 
2 4 6 4 2 
2 4 6 8 6 4 2 
2 4 6 8 10 8 6 4 2
*/
public class Question42 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; ++i) {
			int num = 2;
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