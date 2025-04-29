/* Write a program to print number patterns? 
1 
1 2 3 
1 2 3 4 5 
1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 9 
1 2 3 4 5 6 7 
1 2 3 4 5 
1 2 3 
1 
*/

public class Question56 {
	public static void main(String[] args) {
		int end = 5;
		int extra = 2 * end;
		int till = 1;
		for(int i = 1; i < extra; ++i) {
			for(int j = 1; j <= till; ++j) {
				System.out.print(j + " ");
			}
			if(i < end) {
				till = till + 2;
			} else {
				till = till - 2;
			}
			System.out.println();
		}
	}
}