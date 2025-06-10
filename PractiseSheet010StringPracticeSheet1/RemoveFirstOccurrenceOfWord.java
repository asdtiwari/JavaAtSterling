/* WAP to remove first occurrence of a word in a given string */
public class RemoveFirstOccurrenceOfWord {
	public static void main(String[] args) {
		String str = "Write a program to remove first occurrence of a word in a given string in Java";

		String key = "in";
		String search = ' ' + key + ' ';

		int indexOfKey = str.indexOf(search);

		System.out.println(str + '\n');
		if(indexOfKey >= 0) {
			System.out.print("After removing first occurrence of '" + key + "' : " + str.substring(0, indexOfKey + 1) + str.substring(indexOfKey + 1 + key.length()));
		} else {
			System.out.println(key + " is not present");
		}
	}
}