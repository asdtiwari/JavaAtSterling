/* Write a program to print number patterns? 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
public class Question53 {
	public static void main(String[] args) {
		int end = 5;
		for(int i = 1; i <= 5; ++i) {
			for(int j = 1; j <= end + 1 - i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}