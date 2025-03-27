// Write a program to print Cube from 2 to 20.
public class PrintCubeFrom2To20 {
	public static void main(String[] args) {
		int num = 2;
		while(num <= 20) {
			System.out.println("Cube of " + num + " is " + (num * num * num));
			++num;
		}
	}
}