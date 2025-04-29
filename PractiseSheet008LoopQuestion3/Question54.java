/* Write a program to print number patterns? 
1 2 3 4 5 
2 3 4 5 
3 4 5 
4 5 
5
*/
public class Question54 {
	public static void main(String[] args) {
		int end = 5;
		for(int i = 1; i <= 5; ++i) {
			for(int j = i; j <= end; ++j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}