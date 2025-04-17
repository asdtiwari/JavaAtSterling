/* Write a program to print number patterns? 
5 6 7 8 9 
4 5 6 7 
3 4 5 
2 3  
1
*/
public class Question33 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 5; i > 0; --i) {
			for(int j = i; j < 2 * i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}