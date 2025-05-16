/* Write a program to print number patterns? 
1 
3  2 
4  5  6 
10 9  8  7 
11 12 13 14 15
*/
public class Question51 {
	public static void main(String[] args) {
		int end = 10;
		for(int i = 1; i <= end; ++i) {
			int num = 0;
			if(i % 2 == 0) {
				num = i * (i + 1) / 2;
				for(int j = 1; j <= i; ++j) {
					System.out.print(num + " ");
					--num;
				}
			} else {
				num = (i - 1) * i / 2;
				for(int j = 1; j <= i; ++j) {
					++num;
					System.out.print(num + " ");
				}
			}
			System.out.println();
		}
	}
}