/* Write a program to replace Last occurrence of a character with another in a string. */
public class ReplaceLastOccurrenceWithAnother {
	public static void main(String[] args) {
		String str = "Write a program to replace first occurrence of a character with another in a string";

		char key = 'f';
		char replace = 'T';

		int lastIndexOfKey = str.lastIndexOf(key);

		if(lastIndexOfKey >= 0) {
			System.out.println("Original String : " + str + '\n');
			System.out.println("After replacing last occurrence of '" + key + "' with '" + replace + "' : " + str.substring(0, lastIndexOfKey) + replace + str.substring(lastIndexOfKey + 1));
		} else {
			System.out.println("key not found");
		}
	}
}