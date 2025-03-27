/* Write a program to print table of 2. 
Expected output: 
2 x 1 = 2 
2 x 2 = 4 
2 x 3 = 6 
2 x 4 = 8 
2 x 5 = 10 
2 x 6 = 12 
2 x 7 = 14 
2 x 8 = 16 
2 x 9 = 18 
2 x 10 = 20
*/
public class PrintTableOf2 {
	public static void main(String[] args) {
		for(int times = 1; times <= 10; ++times) {
			System.out.println("2 * " + times + " = " + (2 * times));
		}
	}
}