/* 6. Write a program to print the following pattern: 
Expected Output: 
* * * * *  
* * * * *  
* * * * *  
* * * * *  
* * * * * 
*/

public class PrintStarPattern1 {
	public static void main(String[] args) {
		int row = 5;
		while(row > 0) {
			int col = 5;
			while(col > 0) {
				System.out.print("*");
				--col;
			}
			System.out.println();
			--row;
		}
	}
}