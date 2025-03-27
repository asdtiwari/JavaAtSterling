/* 9. Write a program to print the following pattern: 
Expected Output: 
1 
2 2  
3 3 3  
4 4 4 4   
5 5 5 5 5 */

public class PrintNumericRightTriangle2 {
	public static void main(String[] args) {
		int row = 1;
		while(row <= 5) {
			int col = 1;
			while(col <= row) {
				System.out.print(row + " ");
				++col;
			}
			System.out.println();
			++row;
		}
	}
}