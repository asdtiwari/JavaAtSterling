/* 7. Write a program to print the following pattern: 
Expected Output: 
5 5 5 5 5  
5 5 5 5 5  
5 5 5 5 5  
5 5 5 5 5  
5 5 5 5 5 */

public class Print5Pattern {
	public static void main(String[] args) {
		int row = 5;
		while(row > 0) {
			int col = 5;
			while(col > 0) {
				System.out.print("5 ");
				--col;
			}
			System.out.println();
			--row;
		}
	}
}