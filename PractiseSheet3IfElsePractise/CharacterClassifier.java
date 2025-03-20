//  Write a program to check whether a character is alphabet, digits or special characters 

public class CharacterClassifier {
	public static void main(String[] args) {
		char character = ' ';
		if(character >= '0') {
			if(character <= '9') {
				System.out.println("Digits");
			}
			else if(character >= 'A') {
				if(character <= 'Z') {
					System.out.println("Uppercase Alphabet");
				}
				else if(character >= 'a') {
					if(character <= 'z') {
						System.out.println("Lowercase Alphabet");
					}
					else {
						System.out.println("Special Character");
					}
				}
				else {
					System.out.println("Special Character");
				}
			}
			else {
				System.out.println("Special Character");
			}
		}
		else {
			System.out.println("Special Character");
		}
	}
}