/* Write a program to print number patterns? 
1 3 5 7 9 
3 5 7 9 
5 7 9 
7 9 
9
*/
public class Question34 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i < 2 * n; i += 2) {
			for(int j = i; j < 2 * n; j += 2) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}