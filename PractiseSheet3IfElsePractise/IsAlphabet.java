// Write a program to check whether a character is alphabet or not

public class IsAlphabet {
	public static void main(String[] args) {
		char character = ' ';
		if(character >= 'A') {
			if(character <= 'Z') {
				System.out.println("Alphabet");
			}
			else if(character >= 'a') {
				if(character <= 'z') {
					System.out.println("Alphabet");
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
			