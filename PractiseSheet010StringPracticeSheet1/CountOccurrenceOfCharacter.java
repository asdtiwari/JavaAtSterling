/* WAP to count occurrences of a character in given string. */
public class CountOccurrenceOfCharacter {
	public static void main(String[] args) {
		String str = "Write a program to count occurrences of a character in given string.";

		char key = 'a';
		int count = 0;

		for(int i = 0, len = str.length(); i < len; ++i) {
			if(str.charAt(i) == key) {
				++count;
			}
		}

		System.out.println(str + "\n\n" + "Occurence of '" + key + "' is " + count);
	}
}