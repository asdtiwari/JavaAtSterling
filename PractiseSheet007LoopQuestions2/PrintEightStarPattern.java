/* Write a program to print Eight with Star Pattern ?
  * * * 
*       *
*       *
*       *
  * * *
*       *
*       *
*       *
  * * *
*/
public class PrintEightStarPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		int extra = 2 * end - 1;
		while(row <= extra) {
			int col = 1;
			while(col <= end) {
				if(row == 1) {
					