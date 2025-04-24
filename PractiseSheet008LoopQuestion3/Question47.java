/* Write a program to print number patterns? 
1 
23 
4567 
89123456 
7891234567891234
*/
public class Question47 {
	public static void main(String[] args) {
		int n = 5;
		int col = 1;
		int num = 1;
		for(int i = 1; i <= n; ++i) {
			for(int j = 1; j <= col; ++j) {
				System.out.print(num);
				++num;
				if(num == 10) {
					num = 1;
				}
			}
			System.out.println();
			col = col * 2;
		}
	}
}