// Write a program to print all ASCII characters with their values. 
public class PrintASCIIValues {
	public static void main(String[] args) {
		char character = 0;
		for(int i = 0; i < 256; ++i) {
			System.out.println(character + " " + i);
			++character;
		}
	}
}