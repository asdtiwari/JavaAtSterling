// Write a program to print Square from 2 to 20.
public class PrintSquareFrom2To20 {
	public static void main(String[] args) {
		int num = 2;
		while(num <= 20) {
			System.out.println("Square of " + num + " is " + (num * num));
			++num;
		}
	}
}