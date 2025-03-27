/* Write a program to print Cube from 2 to 20. */
public class PrintCubeFrom2To20 {
	public static void main(String[] args) {
		for(int num = 2; num <= 20; ++num) {
			System.out.println(num + "^3 = " + (num * num * num));
		}
	}
}