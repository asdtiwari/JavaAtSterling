/* Write a program to replace all occurrence of a character with another in a string. */
public class ReplaceAllOccurrenceWithAnother {
	public static void main(String[] args) {
		String str = "Write a program to replace first occurrence of a character with another in a string";

		char key = 'o';
		char replace = '*';

		int indexOfKey = str.indexOf(key);

		if(indexOfKey >= 0) {
			System.out.println("Original String : " + str + '\n');
			System.out.println("After replacing first occurrence of '" + key + "' with '" + replace + "' : " + str.replace(key, replace));
		} else {
			System.out.println("key not found");
		}
	}
}