// Write a program to check whether a character is uppercase or lowercase alphabet

public class UppercaseLowercase {
	public static void main(String[] args) {
		char alphabet = ' ';
		if(alphabet >= 'A') {
			if(alphabet <= 'Z') {
				System.out.println("Uppercase Alphabet");
			}
			if(alphabet >= 'a') {
				if(alphabet <= 'z') {
					System.out.println("Lowercase Alphabet");
				}
				else {
					System.out.println("Not an Alphabet");
				}
			}
			else {
				System.out.println("Not an Alphabet");
			}
		}
		else {
			System.out.println("Not an Alphabet");
		}
	}
}