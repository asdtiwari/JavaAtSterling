/* Write a program to print all alphabets from a to z.*/
public class PrintAllAlphabets {
	public static void main(String[] args) {
		for(char alpha = 'A'; alpha <= 'Z'; ++alpha) {
			System.out.print(alpha + " ");
		}
		System.out.println();
	}
}