/* Write a program to replace first occurrence of a character with another in a string. */
public class ReplaceFirstOccurrenceWithAnother {
	public static void main(String[] args) {
		String str = "Write a program to replace first occurrence of a character with another in a string";

		char key = 'f';
		char replace = 'T';

		int indexOfKey = str.indexOf(key);

		if(indexOfKey >= 0) {
			System.out.println("Original String : " + str + '\n');
			System.out.println("After replacing first occurrence of '" + key + "' with '" + replace + "' : " + str.substring(0, indexOfKey) + replace + str.substring(indexOfKey + 1));
		} else {
			System.out.println("key not found");
		}
	}
}