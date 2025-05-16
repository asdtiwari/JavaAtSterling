/* Write a program to print number patterns? 
1  
2  6 
3  7  10 
4  8  11 13 
5  9  12 14 15
*/

public class Question49 {
	public static void main(String[] args) {
		int end = 5;
		for(int i = 1; i <= end; ++i) {
			int decrease = end - 1;
			for(int j = 1, num = i; j <= i; ++j) {
				System.out.print(num + " ");
				num = num + decrease;
				--decrease;
			}
			System.out.println();
		}
	}
}