/* Write a program to print number patterns 
1 
2 2 
3 3 3 
2 2 2 2 
1 1 1 1 1
*/
public class Question52 {
	public static void main(String[] args) {
		int end = 5;
		int num = 1;
		for(int i = 1; i <= end; ++i) {
			for(int j = 1; j <= i; ++j) {
				System.out.print(num + " ");
			}
			if(i <= end / 2) {
				++num;
			} else {
				--num;
			}
			System.out.println();
		}
	}
}